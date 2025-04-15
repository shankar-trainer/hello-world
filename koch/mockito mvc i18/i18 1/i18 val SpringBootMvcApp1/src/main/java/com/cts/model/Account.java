package com.cts.model;

import java.util.Date;

public class Account {
	private String name;
	private Float balance;
	private Float equityAllocation;
	private String location;
	
	private Date accountCreationDate;
	
	public Date getAccountCreationDate() {
		return accountCreationDate;
	}

	public void setAccountCreationDate(Date accountCreationDate) {
		this.accountCreationDate = accountCreationDate;
	}

	private String gender;
	private String accountType[];
	

	public String[] getAccountType() {
		return accountType;
	}

	public void setAccountType(String[] accountType) {
		this.accountType = accountType;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getBalance() {
		return balance;
	}

	public void setBalance(Float balance) {
		this.balance = balance;
	}

	public Float getEquityAllocation() {
		return equityAllocation;
	}

	public void setEquityAllocation(Float equityAllocation) {
		this.equityAllocation = equityAllocation;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
