package com.aaa.entity;

/**
 * Repayprincprove entity. @author MyEclipse Persistence Tools
 */
  //������Ϣ֤��
public class Repayprincprove implements java.io.Serializable {

	// Fields

	private Integer repayPrincProveId;
	private Materialtype materialtype;   //�������ͱ�
	private String loanAgreement;//�����ͬ���
	private Float amountMoney;//����Ӧ�����
	private String marriageCertificate;//���޹�ϵ֤��

	// Constructors

	/** default constructor */
	public Repayprincprove() {
	}

	/** full constructor */
	public Repayprincprove(Materialtype materialtype, String loanAgreement,
			Float amountMoney, String marriageCertificate) {
		this.materialtype = materialtype;
		this.loanAgreement = loanAgreement;
		this.amountMoney = amountMoney;
		this.marriageCertificate = marriageCertificate;
	}

	// Property accessors

	public Integer getRepayPrincProveId() {
		return this.repayPrincProveId;
	}

	public void setRepayPrincProveId(Integer repayPrincProveId) {
		this.repayPrincProveId = repayPrincProveId;
	}

	public Materialtype getMaterialtype() {
		return this.materialtype;
	}

	public void setMaterialtype(Materialtype materialtype) {
		this.materialtype = materialtype;
	}

	public String getLoanAgreement() {
		return this.loanAgreement;
	}

	public void setLoanAgreement(String loanAgreement) {
		this.loanAgreement = loanAgreement;
	}

	public Float getAmountMoney() {
		return this.amountMoney;
	}

	public void setAmountMoney(Float amountMoney) {
		this.amountMoney = amountMoney;
	}

	public String getMarriageCertificate() {
		return this.marriageCertificate;
	}

	public void setMarriageCertificate(String marriageCertificate) {
		this.marriageCertificate = marriageCertificate;
	}

}