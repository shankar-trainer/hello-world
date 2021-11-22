package com.capg.abstract1;

public class AccountInfo  extends Account{

	private float balance;
	private String location;
	
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Override
	public void deposit(float bal) {
	 this.balance=this.balance+bal;
	}
	
	@Override
	public void withdraw(float bal) {
		this.balance=this.balance-bal;
	}
	
	
}
