package com.pathinfotech.model;

public class Account {

	private int accountId;
	private  String accountName;
	private String accountLocation;
	private String accountState;
	
	private Department department;
	
	public void cleanup() {
		System.out.println("destroy called");
	}
	
	public void init() {
		System.out.println(getClass()+" init called  ");
		this.accountId=787887;
		this.accountName="transport account";
		this.accountLocation="gurgaon";
		this.accountState="haryana";
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountLocation() {
		return accountLocation;
	}

	public void setAccountLocation(String accountLocation) {
		this.accountLocation = accountLocation;
	}

	public String getAccountState() {
		return accountState;
	}

	public void setAccountState(String accountState) {
		this.accountState = accountState;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
}