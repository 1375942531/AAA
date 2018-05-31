package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;


/**
 * Loanfinal entity. @author MyEclipse Persistence Tools
 */
//���������
public class Loanfinal implements java.io.Serializable {

	// Fields

	private Integer loanFinalId;
	private Loanapplication loanapplication;//����������
	private Borrowmoneyagreement borrowmoneyagreement;//����ͬ
	private Integer infEvaluationTable;//��Ϣ�������
	private Set borrowmoneyagreements = new HashSet(0);

	// Constructors

	/** default constructor */
	public Loanfinal() {
	}

	/** full constructor */
	public Loanfinal(Loanapplication loanapplication,
			Borrowmoneyagreement borrowmoneyagreement,
			Integer infEvaluationTable, Set borrowmoneyagreements) {
		this.loanapplication = loanapplication;
		this.borrowmoneyagreement = borrowmoneyagreement;
		this.infEvaluationTable = infEvaluationTable;
		this.borrowmoneyagreements = borrowmoneyagreements;
	}

	// Property accessors

	public Integer getLoanFinalId() {
		return this.loanFinalId;
	}

	public void setLoanFinalId(Integer loanFinalId) {
		this.loanFinalId = loanFinalId;
	}

	public Loanapplication getLoanapplication() {
		return this.loanapplication;
	}

	public void setLoanapplication(Loanapplication loanapplication) {
		this.loanapplication = loanapplication;
	}

	public Borrowmoneyagreement getBorrowmoneyagreement() {
		return this.borrowmoneyagreement;
	}

	public void setBorrowmoneyagreement(
			Borrowmoneyagreement borrowmoneyagreement) {
		this.borrowmoneyagreement = borrowmoneyagreement;
	}

	public Integer getInfEvaluationTable() {
		return this.infEvaluationTable;
	}

	public void setInfEvaluationTable(Integer infEvaluationTable) {
		this.infEvaluationTable = infEvaluationTable;
	}

	public Set getBorrowmoneyagreements() {
		return this.borrowmoneyagreements;
	}

	public void setBorrowmoneyagreements(Set borrowmoneyagreements) {
		this.borrowmoneyagreements = borrowmoneyagreements;
	}

}