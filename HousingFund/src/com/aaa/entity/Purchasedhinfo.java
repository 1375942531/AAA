package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Purchasedhinfo entity. @author MyEclipse Persistence Tools
 */
   //������Ϣ
public class Purchasedhinfo implements java.io.Serializable {

	// Fields

	private Integer purchasedHinfoId;
	private String housingType;//��������
	private String housingPosition;//����λ��
	private String floorSpace;//ռ�����
	private Float sellingPrice;//���۷���
	private Set purchasecontracts = new HashSet(0);//������ͬ

	// Constructors

	/** default constructor */
	public Purchasedhinfo() {
	}

	/** full constructor */
	public Purchasedhinfo(String housingType, String housingPosition,
			String floorSpace, Float sellingPrice, Set purchasecontracts) {
		this.housingType = housingType;
		this.housingPosition = housingPosition;
		this.floorSpace = floorSpace;
		this.sellingPrice = sellingPrice;
		this.purchasecontracts = purchasecontracts;
	}

	// Property accessors

	public Integer getPurchasedHinfoId() {
		return this.purchasedHinfoId;
	}

	public void setPurchasedHinfoId(Integer purchasedHinfoId) {
		this.purchasedHinfoId = purchasedHinfoId;
	}

	public String getHousingType() {
		return this.housingType;
	}

	public void setHousingType(String housingType) {
		this.housingType = housingType;
	}

	public String getHousingPosition() {
		return this.housingPosition;
	}

	public void setHousingPosition(String housingPosition) {
		this.housingPosition = housingPosition;
	}

	public String getFloorSpace() {
		return this.floorSpace;
	}

	public void setFloorSpace(String floorSpace) {
		this.floorSpace = floorSpace;
	}

	public Float getSellingPrice() {
		return this.sellingPrice;
	}

	public void setSellingPrice(Float sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public Set getPurchasecontracts() {
		return this.purchasecontracts;
	}

	public void setPurchasecontracts(Set purchasecontracts) {
		this.purchasecontracts = purchasecontracts;
	}

}