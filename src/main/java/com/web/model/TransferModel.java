package com.web.model;

public class TransferModel {

	private Long accountNo;
	private String name;
	private String password;
	private Long targetaccount;
	private double amount;
	public TransferModel() {
		super();
		// TODO Auto-generated constructor stub
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
	public Long getTargetaccount() {
		return targetaccount;
	}
	public void setTargetaccount(Long targetaccount) {
		this.targetaccount = targetaccount;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "TransferModel [accountNo=" + accountNo + ", name=" + name + ", password=" + password
				+ ", targetaccount=" + targetaccount + ", amount=" + amount + "]";
	}
	
}
