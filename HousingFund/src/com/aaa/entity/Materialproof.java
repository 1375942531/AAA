package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;


/**
 * Materialproof entity. @author MyEclipse Persistence Tools
 */
  //����֤��
public class Materialproof implements java.io.Serializable {

	// Fields

	private Integer materialProofId;
	
	private Materialtype materialtype;//�������ͱ�
	private Extractdetails extractdetails;//��ȡ����
	private Set materialtypes = new HashSet(0);//����Ч�ֶ�

	// Constructors

	/** default constructor */
	public Materialproof() {
	}

	public Integer getMaterialProofId() {
		return materialProofId;
	}

	public void setMaterialProofId(Integer materialProofId) {
		this.materialProofId = materialProofId;
	}

	public Materialtype getMaterialtype() {
		return materialtype;
	}

	public void setMaterialtype(Materialtype materialtype) {
		this.materialtype = materialtype;
	}

	public Extractdetails getExtractdetails() {
		return extractdetails;
	}

	public void setExtractdetails(Extractdetails extractdetails) {
		this.extractdetails = extractdetails;
	}

	public Set getMaterialtypes() {
		return materialtypes;
	}

	public void setMaterialtypes(Set materialtypes) {
		this.materialtypes = materialtypes;
	}

	public Materialproof(Integer materialProofId, Materialtype materialtype,
			Extractdetails extractdetails, Set materialtypes) {
		super();
		this.materialProofId = materialProofId;
		this.materialtype = materialtype;
		this.extractdetails = extractdetails;
		this.materialtypes = materialtypes;
	}

	

}