package com.aaa.entity;

import java.util.Date;


/**
 * Collateralinfo entity. @author MyEclipse Persistence Tools
 */
//��Ѻ����Ϣ
public class Collateralinfo implements java.io.Serializable {

    // Fields    

	private Integer collateralInfoId;
	private Collateralvalueestimate collateralvalueestimate;//��Ѻ���ֵ����
	private Loanaccountinfo loanaccountinfo;//����ס�������˻���Ϣ����
	private String pawnType;//��Ѻ��������
	private String pawnName;//����ռ�����
    private Proof proof;//Ȩ��֤��
 	private String pawnAddress;//��Ѻ�ﴦ��
 	private Date pawnSetUpDate;//��Ѻ����
 	private Date pawnRelieveDate;//�������
 	private Float pawnValueEsti;//��Ѻ���ֵ

	// Constructors

	/** default constructor */
	public Collateralinfo() {
	}

	/** full constructor */
	public Collateralinfo(Collateralvalueestimate collateralvalueestimate,
			Loanaccountinfo loanaccountinfo, Proof proof, String pawnType,
			String pawnName, String pawnAddress, Date pawnSetUpDate,
			Date pawnRelieveDate, Float pawnValueEsti) {
		this.collateralvalueestimate = collateralvalueestimate;
		this.loanaccountinfo = loanaccountinfo;
		this.proof = proof;
		this.pawnType = pawnType;
		this.pawnName = pawnName;
		this.pawnAddress = pawnAddress;
		this.pawnSetUpDate = pawnSetUpDate;
		this.pawnRelieveDate = pawnRelieveDate;
		this.pawnValueEsti = pawnValueEsti;
	}

	// Property accessors

	public Integer getCollateralInfoId() {
		return this.collateralInfoId;
	}

	public void setCollateralInfoId(Integer collateralInfoId) {
		this.collateralInfoId = collateralInfoId;
	}

	public Collateralvalueestimate getCollateralvalueestimate() {
		return this.collateralvalueestimate;
	}

	public void setCollateralvalueestimate(
			Collateralvalueestimate collateralvalueestimate) {
		this.collateralvalueestimate = collateralvalueestimate;
	}

	public Loanaccountinfo getLoanaccountinfo() {
		return this.loanaccountinfo;
	}

	public void setLoanaccountinfo(Loanaccountinfo loanaccountinfo) {
		this.loanaccountinfo = loanaccountinfo;
	}

	public Proof getProof() {
		return this.proof;
	}

	public void setProof(Proof proof) {
		this.proof = proof;
	}

	public String getPawnType() {
		return this.pawnType;
	}

	public void setPawnType(String pawnType) {
		this.pawnType = pawnType;
	}

	public String getPawnName() {
		return this.pawnName;
	}

	public void setPawnName(String pawnName) {
		this.pawnName = pawnName;
	}

	public String getPawnAddress() {
		return this.pawnAddress;
	}

	public void setPawnAddress(String pawnAddress) {
		this.pawnAddress = pawnAddress;
	}

	public Date getPawnSetUpDate() {
		return this.pawnSetUpDate;
	}

	public void setPawnSetUpDate(Date pawnSetUpDate) {
		this.pawnSetUpDate = pawnSetUpDate;
	}

	public Date getPawnRelieveDate() {
		return this.pawnRelieveDate;
	}

	public void setPawnRelieveDate(Date pawnRelieveDate) {
		this.pawnRelieveDate = pawnRelieveDate;
	}

	public Float getPawnValueEsti() {
		return this.pawnValueEsti;
	}

	public void setPawnValueEsti(Float pawnValueEsti) {
		this.pawnValueEsti = pawnValueEsti;
	}

}