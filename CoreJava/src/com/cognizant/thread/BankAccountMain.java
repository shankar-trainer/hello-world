package com.cognizant.thread;

public class BankAccountMain implements Runnable {
	BankAccount account;

	public BankAccountMain() {
		account = new BankAccount();
		account.setBalance(30000);
	}

	@Override
	public void run() {
		makeDeposit(10000);
		makeWithdraw(20000);
	}

	synchronized 
	void makeWithdraw(float amt) {
		if (account.getBalance() <= 0)
			System.out.println("cannot withdraw balance is " + account.getBalance());
		else {
			account.withdraw(amt);
			System.out.println("account withdrawn with amt " + amt + " balance is " + account.getBalance());
		}
	}

	synchronized void makeDeposit(float amt) {

		if (account.getBalance() >= 50000)
			System.out.println("cannot deposit balance is " + account.getBalance());
		else {
			account.deposit(amt);
			System.out.println("account deposited  with amt " + amt + "  balance is " + account.getBalance());
		}
	}

	public static void main(String[] args) {
		BankAccountMain accountMain = new BankAccountMain();

		Thread t1 = new Thread(accountMain);
		Thread t2 = new Thread(accountMain);
		Thread t3 = new Thread(accountMain);
		t1.start();
		t2.start();
		t3.start();
	}

}
