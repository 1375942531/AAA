package com.aaa.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.aaa.biz.FushBiz;
import com.aaa.biz.LogBiz;
import com.aaa.entity.Fush;
//�廹��ҵ�����
@ParentPackage("struts-default")
@Controller
public class FushAction extends BaseAction<Fush>{
   @Autowired
 	private FushBiz biz;
   @Autowired
   private LogBiz logbiz;
  //ҵ���������
   @Action(value="save_fush",results={@Result(name="success",location="/BackJsp/hcq/SUCCESS.jsp")}) 
   public String save_fush(){
	     getModel().setStatus("����");
	     biz.work(getModel());
	   return SUCCESS;
   }
   //�����־��ѯ
   @Action(value="getAllLog",results={@Result(name="success",location="/BackJsp/hcq/showLog.jsp")}) 
   public String getAllLog(){
	   getRequestMap().put("list", logbiz.getAll());
	   return SUCCESS;
 }
}
