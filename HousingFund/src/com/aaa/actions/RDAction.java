package com.aaa.actions;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.stereotype.Controller;

import com.aaa.biz.IndaccountinfoBiz;
import com.aaa.biz.IndaccountinfoBizImpl;
import com.aaa.biz.RemittanceDetailBiz;
import com.aaa.biz.RemittanceDetailBizImpl;
import com.aaa.entity.Indaccountinfo;
import com.aaa.entity.Indinfo;
import com.aaa.entity.RDUtil;
import com.aaa.entity.Remittancedetail;
import com.aaa.entity.Utinremittancedetail;
import com.alibaba.fastjson.JSON;

@ParentPackage("struts-default")
@Controller
public class RDAction extends BaseAction<Indinfo>{

	private String jsons;
	
	@Resource
	private IndaccountinfoBiz indbiz;
	@Resource
	private RemittanceDetailBiz rdbiz;
	
	private String idnum;
	private int Indid;
	//ȷ�ϻ��
	@Action("indAccountInfoAdd")
	public String adds() throws IOException{
		System.out.println(jsons);
		//ת��Ϊ����
	try {
		List<RDUtil> list=JSON.parseArray(jsons, RDUtil.class);
		for (RDUtil rdUtil : list) {
			//�޸ĸ����˻�
			indbiz.update_Indaccount(new Indaccountinfo(), rdUtil);
			//��Ӹ��˻�ɼ�¼
			rdbiz.sava_RemittanceDetail(rdUtil,new Remittancedetail());
		}
		//�޸ĵ�λ�˻����
		indbiz.update_utinmoney(list.get(0));
		//��ӵ�λ��ɼ�¼
	rdbiz.sava_UtInRemittanceDetail(list.get(0),new Utinremittancedetail());
	
	getOut().print("true");
	} catch (Exception e) {
		e.printStackTrace();
		getOut().print("flase");
	}
		return null;
	}

	
	
	@Action("ind_seleMoney")
	public String ind_seleMoney() throws IOException{
		System.out.println("idnum:"+idnum);
		List list=indbiz.ind_MyMoney(idnum);
		System.out.println(list);
		if(list.size()>0){
			String json=JSON.toJSONString(list);
			System.out.println(json);
			getOut().print(json);
			
		}else{
			getOut().print(false);
			
		}
		
		
		return null;
	}
	
	
	
	public String getJsons() {
		return jsons;
	}

	public void setJsons(String jsons) {
		this.jsons = jsons;
	}



	public int getIndid() {
		return Indid;
	}



	public void setIndid(int indid) {
		Indid = indid;
	}



	public String getIdnum() {
		return idnum;
	}



	public void setIdnum(String idnum) {
		this.idnum = idnum;
	}
	
	
}
