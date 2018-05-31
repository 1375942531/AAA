package com.aaa.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Loanbook entity. @author MyEclipse Persistence Tools
 */
    //�������
public class Loanbook implements java.io.Serializable {

	// Fields

	private Integer loanBookId;
	private String loanAccount;//�����˻�
	private String lender;//������
	private Float valueOfLoan;//������
	private Date loanDate;//����ʱ��
	private String loanStatus;//����״̬
	private Set borrowmoneyagreements = new HashSet(0);//����ͬ

	// Constructors

	/** default constructor */
	public Loanbook() {
	}

	/** full constructor */
	public Loanbook(String loanAccount, String lender, Float valueOfLoan,
			Date loanDate, String loanStatus, Set borrowmoneyagreements) {
		this.loanAccount = loanAccount;
		this.lender = lender;
		this.valueOfLoan = valueOfLoan;
		this.loanDate = loanDate;
		this.loanStatus = loanStatus;
		this.borrowmoneyagreements = borrowmoneyagreements;
	}

	// Property accessors

	public Integer getLoanBookId() {
		return this.loanBookId;
	}

	public void setLoanBookId(Integer loanBookId) {
		this.loanBookId = loanBookId;
	}

	public String getLoanAccount() {
		return this.loanAccount;
	}

	public void setLoanAccount(String loanAccount) {
		this.loanAccount = loanAccount;
	}

	public String getLender() {
		return this.lender;
	}

	public void setLender(String lender) {
		this.lender = lender;
	}

	public Float getValueOfLoan() {
		return this.valueOfLoan;
	}

	public void setValueOfLoan(Float valueOfLoan) {
		this.valueOfLoan = valueOfLoan;
	}

	public Date getLoanDate() {
		return this.loanDate;
	}

	public void setLoanDate(Date loanDate) {
		this.loanDate = loanDate;
	}

	public String getLoanStatus() {
		return this.loanStatus;
	}

	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}

	public Set getBorrowmoneyagreements() {
		return this.borrowmoneyagreements;
	}

	public void setBorrowmoneyagreements(Set borrowmoneyagreements) {
		this.borrowmoneyagreements = borrowmoneyagreements;
	}

}