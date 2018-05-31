package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Indinfo entity. @author MyEclipse Persistence Tools
 */
 //������Ϣ
public class Indinfo implements java.io.Serializable {
	// Fields
	private Integer indInfoId;
	private String indAccount;//�����˻����
	private String trueName;//��ʵ����
	private String sex;//�Ա�
	private String fixedPhone;//�̶��绰����
	private String phoneNumber;//�ֻ�����
	private String extractCause;/**!�������   ��Ҫɾ��***/
	private String idnumber;//���֤����
	private String wedlockStatus;//����״��
	private String duties;//ְ��
	private String familyAddress;//��ͥסַ
	private Integer familyMonthIncome;//������
	private String utinAccount;//��λ�˻�
	private Set indaccountinfos = new HashSet(0);//�����˻���Ϣ

	// Constructors

	/** default constructor */
	public Indinfo() {
	}

	/** full constructor */
	public Indinfo(String indAccount, String trueName, String sex,
			String fixedPhone, String phoneNumber, String extractCause,
			String idnumber, String wedlockStatus, String duties,
			String familyAddress, Integer familyMonthIncome,
			String utinAccount, Set indaccountinfos) {
		this.indAccount = indAccount;
		this.trueName = trueName;
		this.sex = sex;
		this.fixedPhone = fixedPhone;
		this.phoneNumber = phoneNumber;
		this.extractCause = extractCause;
		this.idnumber = idnumber;
		this.wedlockStatus = wedlockStatus;
		this.duties = duties;
		this.familyAddress = familyAddress;
		this.familyMonthIncome = familyMonthIncome;
		this.utinAccount = utinAccount;
		this.indaccountinfos = indaccountinfos;
	}

	// Property accessors

	public Integer getIndInfoId() {
		return this.indInfoId;
	}

	public void setIndInfoId(Integer indInfoId) {
		this.indInfoId = indInfoId;
	}

	public String getIndAccount() {
		return this.indAccount;
	}

	public void setIndAccount(String indAccount) {
		this.indAccount = indAccount;
	}

	public String getTrueName() {
		return this.trueName;
	}

	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getFixedPhone() {
		return this.fixedPhone;
	}

	public void setFixedPhone(String fixedPhone) {
		this.fixedPhone = fixedPhone;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getExtractCause() {
		return this.extractCause;
	}

	public void setExtractCause(String extractCause) {
		this.extractCause = extractCause;
	}

	public String getIdnumber() {
		return this.idnumber;
	}

	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}

	public String getWedlockStatus() {
		return this.wedlockStatus;
	}

	public void setWedlockStatus(String wedlockStatus) {
		this.wedlockStatus = wedlockStatus;
	}

	public String getDuties() {
		return this.duties;
	}

	public void setDuties(String duties) {
		this.duties = duties;
	}

	public String getFamilyAddress() {
		return this.familyAddress;
	}

	public void setFamilyAddress(String familyAddress) {
		this.familyAddress = familyAddress;
	}

	public Integer getFamilyMonthIncome() {
		return this.familyMonthIncome;
	}

	public void setFamilyMonthIncome(Integer familyMonthIncome) {
		this.familyMonthIncome = familyMonthIncome;
	}

	public String getUtinAccount() {
		return this.utinAccount;
	}

	public void setUtinAccount(String utinAccount) {
		this.utinAccount = utinAccount;
	}

	public Set getIndaccountinfos() {
		return this.indaccountinfos;
	}

	public void setIndaccountinfos(Set indaccountinfos) {
		this.indaccountinfos = indaccountinfos;
	}

}