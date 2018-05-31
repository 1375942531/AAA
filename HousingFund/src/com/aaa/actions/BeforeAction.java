package com.aaa.actions;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.aaa.biz.BeforereturnBiz;
import com.aaa.biz.BorrBiz;
import com.aaa.biz.IndaccountinfoBiz;
import com.aaa.entity.Beforereturn;
import com.aaa.entity.Borrowmoneyagreement;
import com.aaa.entity.Indaccountinfo;
import com.aaa.util.JSON;
@Controller
@ParentPackage("struts-default")
@Scope("properties")
//��ǰ����
public class BeforeAction extends BaseAction<Beforereturn> {
	@Autowired
	BeforereturnBiz biz;
	@Autowired
	BorrBiz borrBiz;
	@Autowired
	IndaccountinfoBiz indBiz;
	//�ύ��ǰ��������
	@Action(value="before_return",results={@Result(name="success",location="/BackJsp/hcq/SUCCESS.jsp")})
	public String before_return(){
		 biz.save(getModel());
		return SUCCESS;
	}
	//��ѯδ��˵���ǰ��������
	@Action(value="check_return",results={@Result(name="success",location="/BackJsp/hcq/check_return.jsp")})
	public String check_return(){
		List list=biz.find();
		getRequestMap().put("list",list);
		return SUCCESS;
	}
	//��ǰ������������
	@Action(value="check_return_end",results={@Result(name="success",location="/BackJsp/hcq/check_return_end.jsp")})
	public String check_return_end(){
		//���������
		Beforereturn before= biz.getBefore(getModel().getId());
		// ��ʷ������¼
		List list=borrBiz.getPaid(before.getBorrowmoneyagreement().getBorrowMoneyAgreementId());
		getRequestMap().put("before", before);
		getRequestMap().put("list", list);
		return SUCCESS;
	}
	//�ύ����
	@Action(value="submit_check_return",results={@Result(name="success",location="/BackJsp/hcq/SUCCESS.jsp")})
	public String submit_check_return(){
		    if(getModel().getStatus().equals("��ͨ��")){//ͨ��
		    	biz.success(getModel());
		    }else{//����
		    	biz.error(getModel());
		    }
		return SUCCESS;
	}
	//������廹����ҵ�������Ϣ����
	private Borrowmoneyagreement borr;
	 @Action("index_push")
	public String index_push(){
		 //ί�з���Ϣ  //�����˻���Ϣ
		 Indaccountinfo entity=new Indaccountinfo();
		 entity.setIdnumber(borr.getBorrowerIdno());
		    borr=borrBiz.getBorr(borr);//�˻����
		 Integer money=indBiz.getMoney(entity);
		    borr.setCoborrower(money.toString());
		 getOut().print(JSON.toJsonRelation( borr));
		 return null;
	 }
	 
    //get set
		public Borrowmoneyagreement getBorr() {
			return borr;
		}
		public void setBorr(Borrowmoneyagreement borr) {
			this.borr = borr;
		}
}
