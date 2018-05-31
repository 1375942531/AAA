package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Borrowmoneyagreement entity. @author MyEclipse Persistence Tools
 */
//����ͬ
public class Borrowmoneyagreement implements java.io.Serializable {

	// Fields

	private Integer borrowMoneyAgreementId;
	private Loanfinal loanfinal;//����
	private Loanbook loanbook;//������
	private Integer repaymentPlanDetailsiId;//��Ч�ֶΣ����������
	private String borrowerName;//���������
	private String borrowMoneyNumber;//�����
	private Integer borrowerFixedYear;//����
	private Float borrowerAnnualRate;//������
	private String repaymentMode;//���ʽ��Ϣ
	private String guarantorInfo;//��������Ϣ���
	private String collateralInfo;//��Ѻ����Ϣ���
	private String coborrower;//��ͬ�����
	private String repaymentAccount;//�����˻�������˻���
	private String borrowerIdno;//��������֤��
	private String borrowerPhone;//��ͬǩ������
	private Set loanfinals = new HashSet(0);
	private Set repaymentplandetailses = new HashSet(0);//����ƻ�

	// Constructors

	/** default constructor */
	public Borrowmoneyagreement() {
	}

	/** full constructor */
	public Borrowmoneyagreement(Loanfinal loanfinal, Loanbook loanbook,
			Integer repaymentPlanDetailsiId, String borrowerName,
			String borrowMoneyNumber, Integer borrowerFixedYear,
			Float borrowerAnnualRate, String repaymentMode,
			String guarantorInfo, String collateralInfo, String coborrower,
			String repaymentAccount, String borrowerIdno, String borrowerPhone,
			Set loanfinals, Set repaymentplandetailses) {
		this.loanfinal = loanfinal;
		this.loanbook = loanbook;
		this.repaymentPlanDetailsiId = repaymentPlanDetailsiId;
		this.borrowerName = borrowerName;
		this.borrowMoneyNumber = borrowMoneyNumber;
		this.borrowerFixedYear = borrowerFixedYear;
		this.borrowerAnnualRate = borrowerAnnualRate;
		this.repaymentMode = repaymentMode;
		this.guarantorInfo = guarantorInfo;
		this.collateralInfo = collateralInfo;
		this.coborrower = coborrower;
		this.repaymentAccount = repaymentAccount;
		this.borrowerIdno = borrowerIdno;
		this.borrowerPhone = borrowerPhone;
		this.loanfinals = loanfinals;
		this.repaymentplandetailses = repaymentplandetailses;
	}

	// Property accessors

	public Integer getBorrowMoneyAgreementId() {
		return this.borrowMoneyAgreementId;
	}

	public void setBorrowMoneyAgreementId(Integer borrowMoneyAgreementId) {
		this.borrowMoneyAgreementId = borrowMoneyAgreementId;
	}

	public Loanfinal getLoanfinal() {
		return this.loanfinal;
	}

	public void setLoanfinal(Loanfinal loanfinal) {
		this.loanfinal = loanfinal;
	}

	public Loanbook getLoanbook() {
		return this.loanbook;
	}

	public void setLoanbook(Loanbook loanbook) {
		this.loanbook = loanbook;
	}

	public Integer getRepaymentPlanDetailsiId() {
		return this.repaymentPlanDetailsiId;
	}

	public void setRepaymentPlanDetailsiId(Integer repaymentPlanDetailsiId) {
		this.repaymentPlanDetailsiId = repaymentPlanDetailsiId;
	}

	public String getBorrowerName() {
		return this.borrowerName;
	}

	public void setBorrowerName(String borrowerName) {
		this.borrowerName = borrowerName;
	}

	public String getBorrowMoneyNumber() {
		return this.borrowMoneyNumber;
	}

	public void setBorrowMoneyNumber(String borrowMoneyNumber) {
		this.borrowMoneyNumber = borrowMoneyNumber;
	}

	public Integer getBorrowerFixedYear() {
		return this.borrowerFixedYear;
	}

	public void setBorrowerFixedYear(Integer borrowerFixedYear) {
		this.borrowerFixedYear = borrowerFixedYear;
	}

	public Float getBorrowerAnnualRate() {
		return this.borrowerAnnualRate;
	}

	public void setBorrowerAnnualRate(Float borrowerAnnualRate) {
		this.borrowerAnnualRate = borrowerAnnualRate;
	}

	public String getRepaymentMode() {
		return this.repaymentMode;
	}

	public void setRepaymentMode(String repaymentMode) {
		this.repaymentMode = repaymentMode;
	}

	public String getGuarantorInfo() {
		return this.guarantorInfo;
	}

	public void setGuarantorInfo(String guarantorInfo) {
		this.guarantorInfo = guarantorInfo;
	}

	public String getCollateralInfo() {
		return this.collateralInfo;
	}

	public void setCollateralInfo(String collateralInfo) {
		this.collateralInfo = collateralInfo;
	}

	public String getCoborrower() {
		return this.coborrower;
	}

	public void setCoborrower(String coborrower) {
		this.coborrower = coborrower;
	}

	public String getRepaymentAccount() {
		return this.repaymentAccount;
	}

	public void setRepaymentAccount(String repaymentAccount) {
		this.repaymentAccount = repaymentAccount;
	}

	public String getBorrowerIdno() {
		return this.borrowerIdno;
	}

	public void setBorrowerIdno(String borrowerIdno) {
		this.borrowerIdno = borrowerIdno;
	}

	public String getBorrowerPhone() {
		return this.borrowerPhone;
	}

	public void setBorrowerPhone(String borrowerPhone) {
		this.borrowerPhone = borrowerPhone;
	}

	public Set getLoanfinals() {
		return this.loanfinals;
	}

	public void setLoanfinals(Set loanfinals) {
		this.loanfinals = loanfinals;
	}

	public Set getRepaymentplandetailses() {
		return this.repaymentplandetailses;
	}

	public void setRepaymentplandetailses(Set repaymentplandetailses) {
		this.repaymentplandetailses = repaymentplandetailses;
	}

}