package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Collateralvalueestimate entity. @author MyEclipse Persistence Tools
 */
//��Ѻ���ֵ����
public class Collateralvalueestimate implements java.io.Serializable {
	// Fields
	private Integer collateralValueEstimateId;
	private String pawnType;//����
	private String pawnAddress;//���ڵ�
	private String pawnOwner;//������
	private String ownerIdno;//��Ч�ֶΣ����������֤��
	private Float pawnValueEsti;//������ֵ
	private String remarks;//��ע
	private Set collateralinfos = new HashSet(0);//��Ѻ��

	// Constructors

	/** default constructor */
	public Collateralvalueestimate() {
	}

	/** full constructor */
	public Collateralvalueestimate(String pawnType, String pawnAddress,
			String pawnOwner, String ownerIdno, Float pawnValueEsti,
			String remarks, Set collateralinfos) {
		this.pawnType = pawnType;
		this.pawnAddress = pawnAddress;
		this.pawnOwner = pawnOwner;
		this.ownerIdno = ownerIdno;
		this.pawnValueEsti = pawnValueEsti;
		this.remarks = remarks;
		this.collateralinfos = collateralinfos;
	}

	// Property accessors

	public Integer getCollateralValueEstimateId() {
		return this.collateralValueEstimateId;
	}

	public void setCollateralValueEstimateId(Integer collateralValueEstimateId) {
		this.collateralValueEstimateId = collateralValueEstimateId;
	}

	public String getPawnType() {
		return this.pawnType;
	}

	public void setPawnType(String pawnType) {
		this.pawnType = pawnType;
	}

	public String getPawnAddress() {
		return this.pawnAddress;
	}

	public void setPawnAddress(String pawnAddress) {
		this.pawnAddress = pawnAddress;
	}

	public String getPawnOwner() {
		return this.pawnOwner;
	}

	public void setPawnOwner(String pawnOwner) {
		this.pawnOwner = pawnOwner;
	}

	public String getOwnerIdno() {
		return this.ownerIdno;
	}

	public void setOwnerIdno(String ownerIdno) {
		this.ownerIdno = ownerIdno;
	}

	public Float getPawnValueEsti() {
		return this.pawnValueEsti;
	}

	public void setPawnValueEsti(Float pawnValueEsti) {
		this.pawnValueEsti = pawnValueEsti;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Set getCollateralinfos() {
		return this.collateralinfos;
	}

	public void setCollateralinfos(Set collateralinfos) {
		this.collateralinfos = collateralinfos;
	}

}