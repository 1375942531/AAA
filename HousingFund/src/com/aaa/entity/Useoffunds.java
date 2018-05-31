package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Useoffunds entity. @author MyEclipse Persistence Tools
 */
   //������������
public class Useoffunds implements java.io.Serializable {

	// Fields

	private Integer useOfFundsId;
	private String useDescription;//��������
	private String remarkInfo;//��ע��Ϣ
	private Set loanapplications = new HashSet(0);//���������

	// Constructors

	/** default constructor */
	public Useoffunds() {
	}

	/** full constructor */
	public Useoffunds(String useDescription, String remarkInfo,
			Set loanapplications) {
		this.useDescription = useDescription;
		this.remarkInfo = remarkInfo;
		this.loanapplications = loanapplications;
	}

	// Property accessors

	public Integer getUseOfFundsId() {
		return this.useOfFundsId;
	}

	public void setUseOfFundsId(Integer useOfFundsId) {
		this.useOfFundsId = useOfFundsId;
	}

	public String getUseDescription() {
		return this.useDescription;
	}

	public void setUseDescription(String useDescription) {
		this.useDescription = useDescription;
	}

	public String getRemarkInfo() {
		return this.remarkInfo;
	}

	public void setRemarkInfo(String remarkInfo) {
		this.remarkInfo = remarkInfo;
	}

	public Set getLoanapplications() {
		return this.loanapplications;
	}

	public void setLoanapplications(Set loanapplications) {
		this.loanapplications = loanapplications;
	}

}