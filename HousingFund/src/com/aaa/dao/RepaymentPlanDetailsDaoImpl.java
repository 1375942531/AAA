package com.aaa.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.aaa.entity.Repaymentplandetails;
@Repository
public class RepaymentPlanDetailsDaoImpl extends BaseDaoImpl<Repaymentplandetails> implements RepaymentPlanDetailsDao {
   //ɾ����Ч�Ļ���ƻ���û��������ͬ�����Ľ��ƻ���
	@Override
	public void del() {
		List<Repaymentplandetails> list = getAll();
		for (Repaymentplandetails repay: list) {
		    if(repay.getBorrowmoneyagreement()==null){
		    	delect(repay);
		    }	
		}
		
	}

}
