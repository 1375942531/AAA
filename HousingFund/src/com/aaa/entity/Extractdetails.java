package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;


/**
 * Extractdetails entity. @author MyEclipse Persistence Tools
 */
//ס����������ȡ����
public class Extractdetails implements java.io.Serializable {

	// Fields

	private Integer extractDetailsId;
	private Identificationpaper identificationpaper;//���֤��
	private Extractionandapproval extractionandapproval;//��ȡ������
	private Extractionmode extractionmode;//��ȡ��ʽ
	private Float withdrawalAmount;//��ȡ���
	private Causeofextraction causeofextraction;//
	private Set materialproofs = new HashSet(0);//����֤��
	private Set causeofextractions = new HashSet(0);//��ȡԭ��

	// Constructors

	/** default constructor */
	public Extractdetails() {
	}

	/** full constructor */
	public Extractdetails(Identificationpaper identificationpaper,
			Causeofextraction causeofextraction,
			Extractionandapproval extractionandapproval,
			Extractionmode extractionmode, Float withdrawalAmount,
			Set materialproofs, Set causeofextractions) {
		this.identificationpaper = identificationpaper;
		this.causeofextraction = causeofextraction;
		this.extractionandapproval = extractionandapproval;
		this.extractionmode = extractionmode;
		this.withdrawalAmount = withdrawalAmount;
		this.materialproofs = materialproofs;
		this.causeofextractions = causeofextractions;
	}

	// Property accessors

	public Integer getExtractDetailsId() {
		return this.extractDetailsId;
	}

	public void setExtractDetailsId(Integer extractDetailsId) {
		this.extractDetailsId = extractDetailsId;
	}

	public Identificationpaper getIdentificationpaper() {
		return this.identificationpaper;
	}

	public void setIdentificationpaper(Identificationpaper identificationpaper) {
		this.identificationpaper = identificationpaper;
	}

	public Causeofextraction getCauseofextraction() {
		return this.causeofextraction;
	}

	public void setCauseofextraction(Causeofextraction causeofextraction) {
		this.causeofextraction = causeofextraction;
	}

	public Extractionandapproval getExtractionandapproval() {
		return this.extractionandapproval;
	}

	public void setExtractionandapproval(
			Extractionandapproval extractionandapproval) {
		this.extractionandapproval = extractionandapproval;
	}

	public Extractionmode getExtractionmode() {
		return this.extractionmode;
	}

	public void setExtractionmode(Extractionmode extractionmode) {
		this.extractionmode = extractionmode;
	}

	public Float getWithdrawalAmount() {
		return this.withdrawalAmount;
	}

	public void setWithdrawalAmount(Float withdrawalAmount) {
		this.withdrawalAmount = withdrawalAmount;
	}

	public Set getMaterialproofs() {
		return this.materialproofs;
	}

	public void setMaterialproofs(Set materialproofs) {
		this.materialproofs = materialproofs;
	}

	public Set getCauseofextractions() {
		return this.causeofextractions;
	}

	public void setCauseofextractions(Set causeofextractions) {
		this.causeofextractions = causeofextractions;
	}

}