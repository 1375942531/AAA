package com.aaa.biz;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aaa.dao.RepaymentPlanDetailsDao;
import com.aaa.entity.Overduerepayment;
import com.aaa.entity.Repaymentplandetails;

@Transactional
@Service
public class RepaymentPlanDetailsBizImpl implements RepaymentPlanDetailsBiz {
  @Autowired
  RepaymentPlanDetailsDao dao;
  //��������(���ڷ�Ϣ=������)
	@Override
	public void task() {
		try {
			dao.del();//�����Ч����
			List<Repaymentplandetails> list = dao.getAll();
			 for (Repaymentplandetails repay: list) {
				if(repay.getRepaymentStatus().equals("δ��")||repay.getRepaymentStatus().equals("����δ��")){
				   if(new Date().compareTo(repay.getRepaymentDeadline())>0){//����
					    Date date1=new Date();//��ǰ����
						Date date2=repay.getRepaymentDeadline();//��������
						int number=(int) ((date1.getTime()-date2.getTime())/1000/60/60/24);
						//��Ϣ
						Float bx=repay.getCurrentReturnedCorpus()+repay.getCurrentReturnedInterest();
						//��Ϣ����
						Float lv=repay.getBorrowmoneyagreement().getBorrowerAnnualRate()*1.5F/100/360;
						//��Ϣ���
						 Float money=bx*lv*number;
						 repay.setOverduePrincipalAndInte(money);
						 repay.setRepaymentStatus("����δ��");
						 if(repay.getOverduerepayment()==null){
							 Overduerepayment entity = new Overduerepayment();
							 entity.setDefaultInterest(money);
							 repay.setOverduerepayment(entity);
						 }else{
							 repay.getOverduerepayment().setDefaultInterest(money);
						 }
				   };
				}
				}
		} catch (Exception e) {
			System.out.println("�������ڳ����쳣����Ϣ����");
			e.printStackTrace();
		}
	}
	
}
