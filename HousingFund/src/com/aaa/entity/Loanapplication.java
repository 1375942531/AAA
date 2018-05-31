package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;



/**
 * Loanapplication entity. @author MyEclipse Persistence Tools
 */
//ס����������������
public class Loanapplication implements java.io.Serializable {
	// Fields
	private Integer loanApplicationId;
	private String nameOfBorrower;//���������
	private String borrowerIdnumber;//���֤��
	private String borrowersUnit;//���ڵ�λ����
	private String borrowerPhone;//��ϵ�绰
	private String indAccount;//�������˻����
	private Float borrowingBalance;//�����
	private Integer lentYearsNumber;//������ޣ��Ƽ�����Ϊ��λ��
	private Float borrowerMonthMoney;//�����������
	private Useoffunds useoffunds;//������������
	private Purchasecontract purchasecontract;//������ͬ
	private Guaranteemode guaranteemode;//������ʽ
	private Coborrower coborrower;//��ͬ����ˣ����ޣ�
	private Float annualRate;//����
	private String remarks;//�Ƿ����׷�
	private String status="δ����";//����״̬
	private String unitAddress;//���ʽ
	private Set loanfinals = new HashSet(0);

	// Constructors

	/** default constructor */
	public Loanapplication() {
	}

	/** full constructor */
	public Loanapplication(Purchasecontract purchasecontract,
			Coborrower coborrower, Useoffunds useoffunds,
			Guaranteemode guaranteemode, String nameOfBorrower,
			String borrowerIdnumber, String borrowersUnit,
			String borrowerPhone, String indAccount, String unitAddress,
			Float borrowerMonthMoney, Float borrowingBalance,
			Integer lentYearsNumber, Float annualRate, String remarks,
			String status, Set loanfinals) {
		this.purchasecontract = purchasecontract;
		this.coborrower = coborrower;
		this.useoffunds = useoffunds;
		this.guaranteemode = guaranteemode;
		this.nameOfBorrower = nameOfBorrower;
		this.borrowerIdnumber = borrowerIdnumber;
		this.borrowersUnit = borrowersUnit;
		this.borrowerPhone = borrowerPhone;
		this.indAccount = indAccount;
		this.unitAddress = unitAddress;
		this.borrowerMonthMoney = borrowerMonthMoney;
		this.borrowingBalance = borrowingBalance;
		this.lentYearsNumber = lentYearsNumber;
		this.annualRate = annualRate;
		this.remarks = remarks;
		this.status = status;
		this.loanfinals = loanfinals;
	}

	// Property accessors

	public Integer getLoanApplicationId() {
		return this.loanApplicationId;
	}

	public void setLoanApplicationId(Integer loanApplicationId) {
		this.loanApplicationId = loanApplicationId;
	}

	public Purchasecontract getPurchasecontract() {
		return this.purchasecontract;
	}

	public void setPurchasecontract(Purchasecontract purchasecontract) {
		this.purchasecontract = purchasecontract;
	}

	public Coborrower getCoborrower() {
		return this.coborrower;
	}

	public void setCoborrower(Coborrower coborrower) {
		this.coborrower = coborrower;
	}

	public Useoffunds getUseoffunds() {
		return this.useoffunds;
	}

	public void setUseoffunds(Useoffunds useoffunds) {
		this.useoffunds = useoffunds;
	}

	public Guaranteemode getGuaranteemode() {
		return this.guaranteemode;
	}

	public void setGuaranteemode(Guaranteemode guaranteemode) {
		this.guaranteemode = guaranteemode;
	}

	public String getNameOfBorrower() {
		return this.nameOfBorrower;
	}

	public void setNameOfBorrower(String nameOfBorrower) {
		this.nameOfBorrower = nameOfBorrower;
	}

	public String getBorrowerIdnumber() {
		return this.borrowerIdnumber;
	}

	public void setBorrowerIdnumber(String borrowerIdnumber) {
		this.borrowerIdnumber = borrowerIdnumber;
	}

	public String getBorrowersUnit() {
		return this.borrowersUnit;
	}

	public void setBorrowersUnit(String borrowersUnit) {
		this.borrowersUnit = borrowersUnit;
	}

	public String getBorrowerPhone() {
		return this.borrowerPhone;
	}

	public void setBorrowerPhone(String borrowerPhone) {
		this.borrowerPhone = borrowerPhone;
	}

	public String getIndAccount() {
		return this.indAccount;
	}

	public void setIndAccount(String indAccount) {
		this.indAccount = indAccount;
	}

	public String getUnitAddress() {
		return this.unitAddress;
	}

	public void setUnitAddress(String unitAddress) {
		this.unitAddress = unitAddress;
	}

	public Float getBorrowerMonthMoney() {
		return this.borrowerMonthMoney;
	}

	public void setBorrowerMonthMoney(Float borrowerMonthMoney) {
		this.borrowerMonthMoney = borrowerMonthMoney;
	}

	public Float getBorrowingBalance() {
		return this.borrowingBalance;
	}

	public void setBorrowingBalance(Float borrowingBalance) {
		this.borrowingBalance = borrowingBalance;
	}

	public Integer getLentYearsNumber() {
		return this.lentYearsNumber;
	}

	public void setLentYearsNumber(Integer lentYearsNumber) {
		this.lentYearsNumber = lentYearsNumber;
	}

	public Float getAnnualRate() {
		return this.annualRate;
	}

	public void setAnnualRate(Float annualRate) {
		this.annualRate = annualRate;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set getLoanfinals() {
		return this.loanfinals;
	}

	public void setLoanfinals(Set loanfinals) {
		this.loanfinals = loanfinals;
	}

}