package com.cognizant.thread;

public class BankAccount {

	private float balance;
	
	public void deposit(float amt) {
		this.balance=this.balance+amt;
	}
	
	public void withdraw(float amt) {
		this.balance=this.balance-amt;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
}
