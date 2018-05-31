package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Coborrower entity. @author MyEclipse Persistence Tools
 */
//��ͬ�����
public class Coborrower implements java.io.Serializable {

	// Fields

	private Integer coborrowerId;
	private String coborrowerAccount;//��ͬ������˻�
	private String coborrowerName;//����
	private String coborrowerPhone;//�ֻ���
	private String coborrowerAddress;//��ַ
	private String coborrowerUtinName;//��λ����
	private String coborrowerIdno;//���֤��
	private Float coborrowerMonthMoney;//������
	private String relation;//�����˹�ϵ
	private Set loanapplications = new HashSet(0);//���������

	// Constructors

	/** default constructor */
	public Coborrower() {
	}

	/** full constructor */
	public Coborrower(String coborrowerAccount, String coborrowerName,
			String coborrowerPhone, String coborrowerAddress,
			String coborrowerUtinName, String coborrowerIdno,
			Float coborrowerMonthMoney, String relation, Set loanapplications) {
		this.coborrowerAccount = coborrowerAccount;
		this.coborrowerName = coborrowerName;
		this.coborrowerPhone = coborrowerPhone;
		this.coborrowerAddress = coborrowerAddress;
		this.coborrowerUtinName = coborrowerUtinName;
		this.coborrowerIdno = coborrowerIdno;
		this.coborrowerMonthMoney = coborrowerMonthMoney;
		this.relation = relation;
		this.loanapplications = loanapplications;
	}

	// Property accessors

	public Integer getCoborrowerId() {
		return this.coborrowerId;
	}

	public void setCoborrowerId(Integer coborrowerId) {
		this.coborrowerId = coborrowerId;
	}

	public String getCoborrowerAccount() {
		return this.coborrowerAccount;
	}

	public void setCoborrowerAccount(String coborrowerAccount) {
		this.coborrowerAccount = coborrowerAccount;
	}

	public String getCoborrowerName() {
		return this.coborrowerName;
	}

	public void setCoborrowerName(String coborrowerName) {
		this.coborrowerName = coborrowerName;
	}

	public String getCoborrowerPhone() {
		return this.coborrowerPhone;
	}

	public void setCoborrowerPhone(String coborrowerPhone) {
		this.coborrowerPhone = coborrowerPhone;
	}

	public String getCoborrowerAddress() {
		return this.coborrowerAddress;
	}

	public void setCoborrowerAddress(String coborrowerAddress) {
		this.coborrowerAddress = coborrowerAddress;
	}

	public String getCoborrowerUtinName() {
		return this.coborrowerUtinName;
	}

	public void setCoborrowerUtinName(String coborrowerUtinName) {
		this.coborrowerUtinName = coborrowerUtinName;
	}

	public String getCoborrowerIdno() {
		return this.coborrowerIdno;
	}

	public void setCoborrowerIdno(String coborrowerIdno) {
		this.coborrowerIdno = coborrowerIdno;
	}

	public Float getCoborrowerMonthMoney() {
		return this.coborrowerMonthMoney;
	}

	public void setCoborrowerMonthMoney(Float coborrowerMonthMoney) {
		this.coborrowerMonthMoney = coborrowerMonthMoney;
	}

	public String getRelation() {
		return this.relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public Set getLoanapplications() {
		return this.loanapplications;
	}

	public void setLoanapplications(Set loanapplications) {
		this.loanapplications = loanapplications;
	}

}