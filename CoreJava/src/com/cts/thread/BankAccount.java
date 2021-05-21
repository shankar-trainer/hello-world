package com.cts.thread;

public class BankAccount {

	private float balance = 100;

	public synchronized void deposit(float amount) {

		balance = balance + amount;
		System.out.println("deposit " + amount + "  balance is " + balance);
	}

	public synchronized void withdraw(float amount) {
		balance = balance - amount;
		System.out.println("withdraw " + amount + "  balance is " + balance);
	}

}
