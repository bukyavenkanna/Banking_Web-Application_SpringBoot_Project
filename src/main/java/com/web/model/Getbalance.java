package com.web.model;

public class Getbalance {

	private Long accountNo;
	private String name;
	private String password;
	public Getbalance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Getbalance(Long accountNo, String name, String password) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.password = password;
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
	@Override
	public String toString() {
		return "getbalance [accountNo=" + accountNo + ", name=" + name + ", password=" + password + "]";
	}
	
}
