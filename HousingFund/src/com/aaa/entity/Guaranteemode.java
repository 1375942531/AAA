package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Guaranteemode entity. @author MyEclipse Persistence Tools
 */
   //������ʽ
public class Guaranteemode implements java.io.Serializable {

	// Fields

	private Integer guaranteeModeId;
	private String securityModeDes;//������ʽ��������ǰ������Ѻ,����������Ѻ,�����˵�����
	private Set loanapplications = new HashSet(0);//���������

	// Constructors

	/** default constructor */
	public Guaranteemode() {
	}

	/** full constructor */
	public Guaranteemode(String securityModeDes, Set loanapplications) {
		this.securityModeDes = securityModeDes;
		this.loanapplications = loanapplications;
	}

	// Property accessors

	public Integer getGuaranteeModeId() {
		return this.guaranteeModeId;
	}

	public void setGuaranteeModeId(Integer guaranteeModeId) {
		this.guaranteeModeId = guaranteeModeId;
	}

	public String getSecurityModeDes() {
		return this.securityModeDes;
	}

	public void setSecurityModeDes(String securityModeDes) {
		this.securityModeDes = securityModeDes;
	}

	public Set getLoanapplications() {
		return this.loanapplications;
	}

	public void setLoanapplications(Set loanapplications) {
		this.loanapplications = loanapplications;
	}

}