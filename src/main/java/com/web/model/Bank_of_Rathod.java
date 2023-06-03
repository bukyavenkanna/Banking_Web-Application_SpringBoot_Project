package com.web.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bank_of_Rathod {

	@Id
	private Long accountNo;
	private String name;
	private String password;
	private double amount;
	private String address;
	private Long mobileNo;
	public Bank_of_Rathod() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bank_of_Rathod(Long accountNo, String name, String password, double amount, String address, Long mobileNo) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.password = password;
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
		return "Bank_of_Rathod [accountNo=" + accountNo + ", name=" + name + ", password=" + password + ", amount="
				+ amount + ", address=" + address + ", mobileNo=" + mobileNo + "]";
	}
	
}
