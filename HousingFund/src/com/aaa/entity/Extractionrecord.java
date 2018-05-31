package com.aaa.entity;

import java.util.Date;

/**
 * Extractionrecord entity. @author MyEclipse Persistence Tools
 */
   //��ȡ��¼��
public class Extractionrecord implements java.io.Serializable {

	// Fields

	private Integer extractionRecordId;
	private String extractionUnit;//���ڵ�λ�˻����
	private String extractionAccount;//�����˻����
	private Float withdrawalAmount;//��ȡ���
	private Date extractionDate;//��ȡ����
	private Date loanDate;//�ſ�����
	private Integer extractDetails;//��ȡ������
	private String receptionist;//���������

	// Constructors

	/** default constructor */
	public Extractionrecord() {
	}

	/** full constructor */
	public Extractionrecord(String extractionUnit, String extractionAccount,
			Float withdrawalAmount, Date extractionDate, Date loanDate,
			Integer extractDetails, String receptionist) {
		this.extractionUnit = extractionUnit;
		this.extractionAccount = extractionAccount;
		this.withdrawalAmount = withdrawalAmount;
		this.extractionDate = extractionDate;
		this.loanDate = loanDate;
		this.extractDetails = extractDetails;
		this.receptionist = receptionist;
	}

	// Property accessors

	public Integer getExtractionRecordId() {
		return this.extractionRecordId;
	}

	public void setExtractionRecordId(Integer extractionRecordId) {
		this.extractionRecordId = extractionRecordId;
	}

	public String getExtractionUnit() {
		return this.extractionUnit;
	}

	public void setExtractionUnit(String extractionUnit) {
		this.extractionUnit = extractionUnit;
	}

	public String getExtractionAccount() {
		return this.extractionAccount;
	}

	public void setExtractionAccount(String extractionAccount) {
		this.extractionAccount = extractionAccount;
	}

	public Float getWithdrawalAmount() {
		return this.withdrawalAmount;
	}

	public void setWithdrawalAmount(Float withdrawalAmount) {
		this.withdrawalAmount = withdrawalAmount;
	}

	public Date getExtractionDate() {
		return this.extractionDate;
	}

	public void setExtractionDate(Date extractionDate) {
		this.extractionDate = extractionDate;
	}

	public Date getLoanDate() {
		return this.loanDate;
	}

	public void setLoanDate(Date loanDate) {
		this.loanDate = loanDate;
	}

	public Integer getExtractDetails() {
		return this.extractDetails;
	}

	public void setExtractDetails(Integer extractDetails) {
		this.extractDetails = extractDetails;
	}

	public String getReceptionist() {
		return this.receptionist;
	}

	public void setReceptionist(String receptionist) {
		this.receptionist = receptionist;
	}

}