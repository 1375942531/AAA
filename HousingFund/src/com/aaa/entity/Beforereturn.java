package com.aaa.entity;

/**
 * Beforereturn entity. @author MyEclipse Persistence Tools
 */
//��ǰ���������
public class Beforereturn implements java.io.Serializable {

	// Fields

	private Integer id;//��ǰ������
	private Borrowmoneyagreement borrowmoneyagreement;//�����ͬ
	private String indLoan;//���п���
	private String iphone;//Ԥ���ֻ���
	private String returnMoney;//�ѻ����
	private String afterMoney;//δ�����
	private String afterlixi;//δ����Ϣ
	private String returnType;//��ǰ��������
	private String status;//�����״̬
	private Integer money;//������ǰ������
	private String remark;//��ע

	// Constructors

	public Integer getMoney() {
		return money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}

	/** default constructor */
	public Beforereturn() {
	}

	/** full constructor */
	public Beforereturn(Borrowmoneyagreement borrowmoneyagreement,
			String indLoan, String iphone, String returnMoney,
			String afterMoney, String afterlixi, String returnType,
			String status) {
		this.borrowmoneyagreement = borrowmoneyagreement;
		this.indLoan = indLoan;
		this.iphone = iphone;
		this.returnMoney = returnMoney;
		this.afterMoney = afterMoney;
		this.afterlixi = afterlixi;
		this.returnType = returnType;
		this.status = status;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Borrowmoneyagreement getBorrowmoneyagreement() {
		return this.borrowmoneyagreement;
	}

	public void setBorrowmoneyagreement(
			Borrowmoneyagreement borrowmoneyagreement) {
		this.borrowmoneyagreement = borrowmoneyagreement;
	}

	public String getIndLoan() {
		return this.indLoan;
	}

	public void setIndLoan(String indLoan) {
		this.indLoan = indLoan;
	}

	public String getIphone() {
		return this.iphone;
	}

	public void setIphone(String iphone) {
		this.iphone = iphone;
	}

	public String getReturnMoney() {
		return this.returnMoney;
	}

	public void setReturnMoney(String returnMoney) {
		this.returnMoney = returnMoney;
	}

	public String getAfterMoney() {
		return this.afterMoney;
	}

	public void setAfterMoney(String afterMoney) {
		this.afterMoney = afterMoney;
	}

	public String getAfterlixi() {
		return this.afterlixi;
	}

	public void setAfterlixi(String afterlixi) {
		this.afterlixi = afterlixi;
	}

	public String getReturnType() {
		return this.returnType;
	}

	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}