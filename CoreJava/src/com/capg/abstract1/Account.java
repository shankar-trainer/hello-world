package com.capg.abstract1;

import java.util.Date;

public abstract class Account {
      // instance and class variable 
	  //constructor allowed 
	    
	private int accountNo;
	private String accountName;
	private Date accountOpen;
	public static String state;
	
	public abstract void deposit(float bal);
	public abstract void withdraw(float bal);

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public Date getAccountOpen() {
		return accountOpen;
	}

	public void setAccountOpen(Date accountOpen) {
		this.accountOpen = accountOpen;
	}
}
