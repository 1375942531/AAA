package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Identificationpaper entity. @author MyEclipse Persistence Tools
 */
   //���֤����
public class Identificationpaper implements java.io.Serializable {

	// Fields

	private Integer idno;
	private String idcard;//���֤��
	private String originalIdcard;//��ż���֤��
	private String marriageCertificate;//���޻�����ϵ֤��
	private String domicileCertificate;//����֤��
	private String operatorIdcard;//ί�а���ʱ�����������֤��
	private Set extractdetailses = new HashSet(0);//��ȡ����

	// Constructors

	/** default constructor */
	public Identificationpaper() {
	}

	/** full constructor */
	public Identificationpaper(String idcard, String originalIdcard,
			String marriageCertificate, String domicileCertificate,
			String operatorIdcard, Set extractdetailses) {
		this.idcard = idcard;
		this.originalIdcard = originalIdcard;
		this.marriageCertificate = marriageCertificate;
		this.domicileCertificate = domicileCertificate;
		this.operatorIdcard = operatorIdcard;
		this.extractdetailses = extractdetailses;
	}

	// Property accessors

	public Integer getIdno() {
		return this.idno;
	}

	public void setIdno(Integer idno) {
		this.idno = idno;
	}

	public String getIdcard() {
		return this.idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getOriginalIdcard() {
		return this.originalIdcard;
	}

	public void setOriginalIdcard(String originalIdcard) {
		this.originalIdcard = originalIdcard;
	}

	public String getMarriageCertificate() {
		return this.marriageCertificate;
	}

	public void setMarriageCertificate(String marriageCertificate) {
		this.marriageCertificate = marriageCertificate;
	}

	public String getDomicileCertificate() {
		return this.domicileCertificate;
	}

	public void setDomicileCertificate(String domicileCertificate) {
		this.domicileCertificate = domicileCertificate;
	}

	public String getOperatorIdcard() {
		return this.operatorIdcard;
	}

	public void setOperatorIdcard(String operatorIdcard) {
		this.operatorIdcard = operatorIdcard;
	}

	public Set getExtractdetailses() {
		return this.extractdetailses;
	}

	public void setExtractdetailses(Set extractdetailses) {
		this.extractdetailses = extractdetailses;
	}

}