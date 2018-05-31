package com.aaa.actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.struts2.convention.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.aaa.biz.BorrBiz;
import com.aaa.entity.Borrowmoneyagreement;
import com.aaa.entity.Repaymentplandetails;
import com.aaa.util.JSON;

/**����ͬ**/
@Controller
@ParentPackage("struts-default")
@Scope("properties")
public class BorrAction extends BaseAction<Borrowmoneyagreement> {
	@Autowired
    BorrBiz biz;
 //���ҳ������������	
   @Action("get_borr")
   public String get_borr(){
	       List list=new ArrayList();
	       list.add(biz.getRepay(getModel()));//���һ���
	       list.add(biz.getBorr(getModel()));//����ͬ
	    getOut().print(JSON.toCollectionJson(list));
	       return null;
   }
//ȷ�ϻ����ӡƾ֤��
   @Action(value="sure_borr",results={@Result(name="success",location="/BackJsp/hcq/SUCCESS.jsp")})
   public String sure_borr(){//���»���ƻ�״̬���ж��Ƿ��ѻ��壩
	   boolean success=biz.return_loan(getModel().getBorrowMoneyAgreementId());
	       if(success){//����ɹ�
	    	   return SUCCESS;
	       }else{//����ʧ��
	    	  System.out.println("����ʧ��:��ӡ��־"); 
	    	  return ERROR;
	       }
   }
//���廹���ӡƾ֤��
   @Action(value="sure_end",results={@Result(name="success",location="/BackJsp/hcq/SUCCESS.jsp")})
   public String sure_end(){//���»���ƻ�״̬���ж��Ƿ��ѻ��壩
	   biz.sure_end(getModel().getRepaymentAccount());
	    	   return SUCCESS;
   }
//���������ͬ
   @Action("indexBorr")
   public String indexBorr(){
	   try {
		   //�жϴ�������Ƿ����
		   Borrowmoneyagreement borr=biz.getBorr(getModel());
		   Set<Repaymentplandetails> set=borr.getRepaymentplandetailses();
		      Float money=0F;//�洢�ѻ����
		      int number=0;//�洢�ѻ�����
		   for (Repaymentplandetails repaymentplandetails : set) {
			   String status=repaymentplandetails.getRepaymentStatus();//״̬
			   Float money2=repaymentplandetails.getCurrentReturnedCorpus();//����
			   if(!status.equals("δ��")&&!status.equals("����δ��")){
				   money+=money2;
			   }
			   if(status.equals("�ѻ�")){
				   number++;
			   }
			   
			}
		     //ռ��һ�����Դ��ѻ�����ֵ
		   borr.setRepaymentPlanDetailsiId(number);
		     borr.setCoborrower(money.toString());
		     getOut().print(JSON.toJson(borr));
	} catch (Exception e) {
		e.printStackTrace();
	}
	      return null;
   }
}
