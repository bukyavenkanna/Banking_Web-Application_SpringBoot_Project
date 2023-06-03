package com.web.model;

public class WithdrawModel {
	private Long accountNo;
	private String name;
	private String password;
	private double amount;
	public WithdrawModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WithdrawModel(Long accountNo, String name, String password, double amount) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.password = password;
		this.amount = amount;
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
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "WithdrawModel [accountNo=" + accountNo + ", name=" + name + ", password=" + password + ", amount="
				+ amount + "]";
	}

}
