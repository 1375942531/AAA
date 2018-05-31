package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;


/**
 * Proofofdeath entity. @author MyEclipse Persistence Tools
 */
//����֤��
public class Proofofdeath implements java.io.Serializable {

	// Fields
	private Integer deathCertificateId;
	private Materialtype materialtype;//��������
	private String myName;//����
	private String idno;//���֤��
	private String placeOfDomicile;//�������ڵ�	
	private String causeOfDeath;//����ԭ��
	private Set materialtypes = new HashSet(0);

	// Constructors

	/** default constructor */
	public Proofofdeath() {
	}

	/** full constructor */
	public Proofofdeath(Materialtype materialtype, String myName, String idno,
			String placeOfDomicile, String causeOfDeath, Set materialtypes) {
		this.materialtype = materialtype;
		this.myName = myName;
		this.idno = idno;
		this.placeOfDomicile = placeOfDomicile;
		this.causeOfDeath = causeOfDeath;
		this.materialtypes = materialtypes;
	}

	// Property accessors

	public Integer getDeathCertificateId() {
		return this.deathCertificateId;
	}

	public void setDeathCertificateId(Integer deathCertificateId) {
		this.deathCertificateId = deathCertificateId;
	}

	public Materialtype getMaterialtype() {
		return this.materialtype;
	}

	public void setMaterialtype(Materialtype materialtype) {
		this.materialtype = materialtype;
	}

	public String getMyName() {
		return this.myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public String getIdno() {
		return this.idno;
	}

	public void setIdno(String idno) {
		this.idno = idno;
	}

	public String getPlaceOfDomicile() {
		return this.placeOfDomicile;
	}

	public void setPlaceOfDomicile(String placeOfDomicile) {
		this.placeOfDomicile = placeOfDomicile;
	}

	public String getCauseOfDeath() {
		return this.causeOfDeath;
	}

	public void setCauseOfDeath(String causeOfDeath) {
		this.causeOfDeath = causeOfDeath;
	}

	public Set getMaterialtypes() {
		return this.materialtypes;
	}

	public void setMaterialtypes(Set materialtypes) {
		this.materialtypes = materialtypes;
	}

}