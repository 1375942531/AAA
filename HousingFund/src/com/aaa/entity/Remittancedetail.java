package com.aaa.entity;

import java.util.Date;


/**
 * Remittancedetail entity. @author MyEclipse Persistence Tools
 */
  //�����ϸ��
public class Remittancedetail implements java.io.Serializable {
	// Fields
	private Integer depositInfoId;
	private Utinaccountinfo utinaccountinfo;//��λ�˻���Ϣ
	private String indAccount;//��Ч�ֶΣ������˻�
	private String indAccountId;//�����˻����
	private String utinAccount;//��λ����
	private Float utinPayinMoney;//��λ�ɴ���
	private Float indPayinMoney;//���˽ɴ���
	private Float payinSumMoney;//�ɴ��ܽ��
	private Date payinDate;//�ɴ�ʱ��
	private String operator;//������	
	private String receptionist;//����������

	// Constructors

	/** default constructor */
	public Remittancedetail() {
	}

	/** full constructor */
	public Remittancedetail(Utinaccountinfo utinaccountinfo,
			String indAccountId, String utinAccount, Float utinPayinMoney,
			String indAccount, Float indPayinMoney, Float payinSumMoney,
			Date payinDate, String operator, String receptionist) {
		this.utinaccountinfo = utinaccountinfo;
		this.indAccountId = indAccountId;
		this.utinAccount = utinAccount;
		this.utinPayinMoney = utinPayinMoney;
		this.indAccount = indAccount;
		this.indPayinMoney = indPayinMoney;
		this.payinSumMoney = payinSumMoney;
		this.payinDate = payinDate;
		this.operator = operator;
		this.receptionist = receptionist;
	}

	// Property accessors

	public Integer getDepositInfoId() {
		return this.depositInfoId;
	}

	public void setDepositInfoId(Integer depositInfoId) {
		this.depositInfoId = depositInfoId;
	}

	public Utinaccountinfo getUtinaccountinfo() {
		return this.utinaccountinfo;
	}

	public void setUtinaccountinfo(Utinaccountinfo utinaccountinfo) {
		this.utinaccountinfo = utinaccountinfo;
	}

	public String getIndAccountId() {
		return this.indAccountId;
	}

	public void setIndAccountId(String indAccountId) {
		this.indAccountId = indAccountId;
	}

	public String getUtinAccount() {
		return this.utinAccount;
	}

	public void setUtinAccount(String utinAccount) {
		this.utinAccount = utinAccount;
	}

	public Float getUtinPayinMoney() {
		return this.utinPayinMoney;
	}

	public void setUtinPayinMoney(Float utinPayinMoney) {
		this.utinPayinMoney = utinPayinMoney;
	}

	public String getIndAccount() {
		return this.indAccount;
	}

	public void setIndAccount(String indAccount) {
		this.indAccount = indAccount;
	}

	public Float getIndPayinMoney() {
		return this.indPayinMoney;
	}

	public void setIndPayinMoney(Float indPayinMoney) {
		this.indPayinMoney = indPayinMoney;
	}

	public Float getPayinSumMoney() {
		return this.payinSumMoney;
	}

	public void setPayinSumMoney(Float payinSumMoney) {
		this.payinSumMoney = payinSumMoney;
	}

	public Date getPayinDate() {
		return this.payinDate;
	}

	public void setPayinDate(Date payinDate) {
		this.payinDate = payinDate;
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getReceptionist() {
		return this.receptionist;
	}

	public void setReceptionist(String receptionist) {
		this.receptionist = receptionist;
	}

}