package com.aaa.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.aaa.biz.LoanApplicationBiz;
import com.aaa.biz.LoanaccountinfoBiz;
import com.aaa.entity.Collateralinfo;
import com.aaa.entity.Guarantorinfo;
import com.aaa.entity.Loanaccountinfo;
import com.aaa.entity.Loanapplication;
/**������ϢAction**/
@Controller
@ParentPackage("struts-default")
@Scope("properties")
public class LoanaccountinfoAction extends BaseAction<Loanaccountinfo> {
	Loanapplication loan;//�����飨ǰ̨����һ��ID��
	@Autowired
	LoanaccountinfoBiz biz;
	@Autowired
	LoanApplicationBiz loanbiz;
 //��ز���֤������������Ϣ���⹺����Ϣ������������Ϣ��Ȩ��֤����
	@Action(value="assureAssess_work",results={@Result(name="success",location="/BackJsp/hcq/assureAssess_end.jsp")})
	public String assureAssess_work(){
		loan=loanbiz.getOne(loan.getLoanApplicationId());
		  entity.setRemarks(String.valueOf(loan.getLoanApplicationId()));
		  entity=biz.findByExample(entity);//������Ϣ
		 Collateralinfo coll = entity.getCollateralinfo(); //��Ѻ��
		 Guarantorinfo guar = entity.getGuarantorinfo();//������
		     if(coll!=null){
		    	 getRequestMap().put("coll",coll);
		     }
		     if(guar!=null){
		    	 getRequestMap().put("guar",guar);
		     }
		return SUCCESS;
	}
//�����˵�Ѻ���ֵ�������޸�������״̬����ȫ������Ϣ����ֵ������
	 Collateralinfo coll;//��Ѻ��(��Ҫ����һ����Ѻ���ID����,λ��,������ֵ��������)
	 Guarantorinfo  guar;//������
	@Action(value="cost_fixation",results={@Result(name="success",location="/BackJsp/hcq/SUCCESS.jsp")})
   	public String cost_fixation(){
		if(coll!=null){
			getModel().getCollateralinfos().add(coll);
		}
		if(guar!=null){
			getModel().getGuarantorinfos().add(guar);
		}
		biz.save(getModel(), loan);
		return SUCCESS;
   		
   	}
//��������������
	@Action(value="final_check",results={@Result(name="success",location="/BackJsp/hcq/review_end.jsp")})
   public String final_check(){
		if(coll!=null){
			coll=biz.getColl(loan.getLoanApplicationId());
		}
		if(guar!=null){
			guar=biz.getGuar(loan.getLoanApplicationId());
		}
		loan=loanbiz.getOne(loan.getLoanApplicationId());
		return SUCCESS;
	}
	//get set
	public Loanapplication getLoan() {
		return loan;
	}
	public void setLoan(Loanapplication loan) {
		this.loan = loan;
	}
	public Collateralinfo getColl() {
		return coll;
	}
	public void setColl(Collateralinfo coll) {
		this.coll = coll;
	}
	public Guarantorinfo getGuar() {
		return guar;
	}
	public void setGuar(Guarantorinfo guar) {
		this.guar = guar;
	}
	
	
}
