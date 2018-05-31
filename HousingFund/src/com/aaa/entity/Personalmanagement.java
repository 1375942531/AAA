package com.aaa.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Personalmanagement entity. @author MyEclipse Persistence Tools
 */
 //����������Ա����
public class Personalmanagement implements java.io.Serializable {

	// Fields

	private Integer personalManagementId;
	private String employeeName;//����
	private Date entryTime;//��ְ����
	private String employeeSex;//�Ա�
	private Integer employeeAccount;//�˻�
	private String employeePass;//����
	private Set roleemployees = new HashSet(0);

	// Constructors

	/** default constructor */
	public Personalmanagement() {
	}

	/** full constructor */
	public Personalmanagement(String employeeName, Date entryTime,
			String employeeSex, Integer employeeAccount, String employeePass,
			Set roleemployees) {
		this.employeeName = employeeName;
		this.entryTime = entryTime;
		this.employeeSex = employeeSex;
		this.employeeAccount = employeeAccount;
		this.employeePass = employeePass;
		this.roleemployees = roleemployees;
	}

	// Property accessors

	public Integer getPersonalManagementId() {
		return this.personalManagementId;
	}

	public void setPersonalManagementId(Integer personalManagementId) {
		this.personalManagementId = personalManagementId;
	}

	public String getEmployeeName() {
		return this.employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Date getEntryTime() {
		return this.entryTime;
	}

	public void setEntryTime(Date entryTime) {
		this.entryTime = entryTime;
	}

	public String getEmployeeSex() {
		return this.employeeSex;
	}

	public void setEmployeeSex(String employeeSex) {
		this.employeeSex = employeeSex;
	}

	public Integer getEmployeeAccount() {
		return this.employeeAccount;
	}

	public void setEmployeeAccount(Integer employeeAccount) {
		this.employeeAccount = employeeAccount;
	}

	public String getEmployeePass() {
		return this.employeePass;
	}

	public void setEmployeePass(String employeePass) {
		this.employeePass = employeePass;
	}

	public Set getRoleemployees() {
		return this.roleemployees;
	}

	public void setRoleemployees(Set roleemployees) {
		this.roleemployees = roleemployees;
	}

}