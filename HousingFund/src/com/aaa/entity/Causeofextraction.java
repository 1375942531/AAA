package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;


/**
 * Causeofextraction entity. @author MyEclipse Persistence Tools
 */
//��ȡԭ��
public class Causeofextraction implements java.io.Serializable {

	// Fields

	private Integer reasonNo;
	private Extractdetails extractdetails;//��ȡ����
	private String causeDescription;//��ȡԭ������
	private String remark;//��ע��Ϣ
	private Set extractdetailses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Causeofextraction() {
	}

	/** full constructor */
	public Causeofextraction(Extractdetails extractdetails,
			String causeDescription, String remark, Set extractdetailses) {
		this.extractdetails = extractdetails;
		this.causeDescription = causeDescription;
		this.remark = remark;
		this.extractdetailses = extractdetailses;
	}

	// Property accessors

	public Integer getReasonNo() {
		return this.reasonNo;
	}

	public void setReasonNo(Integer reasonNo) {
		this.reasonNo = reasonNo;
	}

	public Extractdetails getExtractdetails() {
		return this.extractdetails;
	}

	public void setExtractdetails(Extractdetails extractdetails) {
		this.extractdetails = extractdetails;
	}

	public String getCauseDescription() {
		return this.causeDescription;
	}

	public void setCauseDescription(String causeDescription) {
		this.causeDescription = causeDescription;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Set getExtractdetailses() {
		return this.extractdetailses;
	}

	public void setExtractdetailses(Set extractdetailses) {
		this.extractdetailses = extractdetailses;
	}

}