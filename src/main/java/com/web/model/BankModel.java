package com.web.model;

public class BankModel {

	private Long accountNo;
	private String name;
	private String password;
	private String cPassword;
	private double amount;
	private String address;
	private Long mobileNo;
	public BankModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankModel(Long accountNo, String name, String password, String cPassword, double amount, String address,
			Long mobileNo) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.password = password;
		this.cPassword = cPassword;
		this.amount = amount;
		this.address = address;
		this.mobileNo = mobileNo;
	}
	public Long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(Long accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getcPassword() {
		return cPassword;
	}
	public void setcPassword(String cPassword) {
		this.cPassword = cPassword;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "BankModel [accountNo=" + accountNo + ", name=" + name + ", password=" + password + ", cPassword="
				+ cPassword + ", amount=" + amount + ", address=" + address + ", mobileNo=" + mobileNo + "]";
	}
	
}
