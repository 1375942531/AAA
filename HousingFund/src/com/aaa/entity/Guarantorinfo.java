package com.aaa.entity;


/**
 * Guarantorinfo entity. @author MyEclipse Persistence Tools
 */
   //������
public class Guarantorinfo implements java.io.Serializable {

	// Fields

	private Integer guarantorInfoId;
	private Loanaccountinfo loanaccountinfo;//ס��������Ϣ
	private Guarantorinfoestimate guarantorinfoestimate;//��������Ϣ����
	private String guarantorName;//����
	private String guarantorIdno;//���֤��
	private String guarantorAddress;//��ס��ַ
	private String guarantorPhone;//������
	private String guarantorUtin;//���ڵ�λ

	// Constructors

	/** default constructor */
	public Guarantorinfo() {
	}

	/** full constructor */
	public Guarantorinfo(Loanaccountinfo loanaccountinfo,
			Guarantorinfoestimate guarantorinfoestimate, String guarantorName,
			String guarantorIdno, String guarantorAddress,
			String guarantorPhone, String guarantorUtin) {
		this.loanaccountinfo = loanaccountinfo;
		this.guarantorinfoestimate = guarantorinfoestimate;
		this.guarantorName = guarantorName;
		this.guarantorIdno = guarantorIdno;
		this.guarantorAddress = guarantorAddress;
		this.guarantorPhone = guarantorPhone;
		this.guarantorUtin = guarantorUtin;
	}

	// Property accessors

	public Integer getGuarantorInfoId() {
		return this.guarantorInfoId;
	}

	public void setGuarantorInfoId(Integer guarantorInfoId) {
		this.guarantorInfoId = guarantorInfoId;
	}

	public Loanaccountinfo getLoanaccountinfo() {
		return this.loanaccountinfo;
	}

	public void setLoanaccountinfo(Loanaccountinfo loanaccountinfo) {
		this.loanaccountinfo = loanaccountinfo;
	}

	public Guarantorinfoestimate getGuarantorinfoestimate() {
		return this.guarantorinfoestimate;
	}

	public void setGuarantorinfoestimate(
			Guarantorinfoestimate guarantorinfoestimate) {
		this.guarantorinfoestimate = guarantorinfoestimate;
	}

	public String getGuarantorName() {
		return this.guarantorName;
	}

	public void setGuarantorName(String guarantorName) {
		this.guarantorName = guarantorName;
	}

	public String getGuarantorIdno() {
		return this.guarantorIdno;
	}

	public void setGuarantorIdno(String guarantorIdno) {
		this.guarantorIdno = guarantorIdno;
	}

	public String getGuarantorAddress() {
		return this.guarantorAddress;
	}

	public void setGuarantorAddress(String guarantorAddress) {
		this.guarantorAddress = guarantorAddress;
	}

	public String getGuarantorPhone() {
		return this.guarantorPhone;
	}

	public void setGuarantorPhone(String guarantorPhone) {
		this.guarantorPhone = guarantorPhone;
	}

	public String getGuarantorUtin() {
		return this.guarantorUtin;
	}

	public void setGuarantorUtin(String guarantorUtin) {
		this.guarantorUtin = guarantorUtin;
	}

}