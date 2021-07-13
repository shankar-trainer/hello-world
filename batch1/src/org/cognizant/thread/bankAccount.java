package org.cognizant.thread;

public class bankAccount {
	private float balance;
	
	public bankAccount(float balance) {
		super();
		this.balance = balance;
	}
	
	public float getBalance() {
		return balance;
	}

	public synchronized void deposit(float amt) {
		balance+=amt;
	} 
	public synchronized void withdraw(float amt) {
		balance+=amt;
	}		
}
