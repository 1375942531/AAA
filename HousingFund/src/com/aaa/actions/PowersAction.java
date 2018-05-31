package com.aaa.actions;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.aaa.biz.PowersBiz;
import com.aaa.entity.Powers;
import com.aaa.entity.Role;
import com.alibaba.fastjson.JSON;
@ParentPackage("struts-default")
@Controller
public class PowersAction extends BaseAction<Powers> {
	private Powers powers;
	private Role role;
	private String getRole;
	@Autowired
	PowersBiz powersBiz;
	//����һ��
	@Action("addFunction")
	public String addFunction(){
		powersBiz.addFunction(powers);
		getOut().print("true");
		return null;
	}
	//��ѯ����
	/*@Action("ger_All_Powers")
	public String get_All_Powers(){
		List<Powers> list_Powers = powersBiz.getAllPowers(null,null);
		String json_Powers = JSON.toJSONString(list_Powers);
		System.out.println(json_Powers);
		getOut().print(json_Powers);
		return null;
	}
	*/
	@Action("ger_Powers_Role")
	public String ger_Powers_Role(){
		List<Powers> list_Powers = powersBiz.getAllPowers(getRole,role);
		String json_Powers = JSON.toJSONString(list_Powers);
		getOut().print(json_Powers);
		return null;
	}
	
	//ɾ��һ��
	@Action("del_Prowers")
	public String del_Prowers(){
		powersBiz.del_Prowers(powers);
		getOut().print("true");
		return null;
	}
	//��ѯһ��
	@Action("get_This_Powers")
	public String get_This_Powers(){
		String json_This_Powers = JSON.toJSONString(powersBiz.get_This_Powers(powers));
		getOut().print(json_This_Powers);
		return null;
		}
	//�޸�
	@Action("update_powers")
	public String update_powers(){
		powersBiz.update_powers(powers);
		System.out.println("update_powers");
		getOut().print("true");
		return null;
	}
	
	public Powers getPowers() {
		return powers;
	}
	public void setPowers(Powers powers) {
		this.powers = powers;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public String getGetRole() {
		return getRole;
	}
	public void setGetRole(String getRole) {
		this.getRole = getRole;
	}
	
	
}
