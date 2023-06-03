package com.web.model;

public class DipositeModel {
	private Long accountNo;
	private String name;
	private String password;
	private double amount;
	public DipositeModel() {
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
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "DipositeModel [accountNo=" + accountNo + ", name=" + name + ", password=" + password + ", amount="
				+ amount + "]";
	}
	
}
