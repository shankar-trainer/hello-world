package com.capgemini.thread;

public class Account {
//deadlock
	static String res1="transfer1";
	static String res2="transfer2";
	private static float balance;

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		Account.balance = balance;
	}

	public static void deposit(float amt) {
		System.out.println("deposit called");
		balance = balance + amt;
	}

	public  static void withdraw(float amt) {
		System.out.println("withdraw called");
		balance = balance - amt;
	}
}
