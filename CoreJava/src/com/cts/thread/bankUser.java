package com.cts.thread;

public class bankUser implements Runnable {

	BankAccount account;

	public bankUser() {
		account = new BankAccount();
	}

	void userWithdraw(int amt) {
		account.withdraw(amt);
		account.withdraw(amt);
		account.withdraw(amt);
	}

	void userDeposit(int amt) {
		account.deposit(amt);
		account.deposit(amt);
		account.deposit(amt);
	}

	@Override
	public void run() {
		userDeposit(10);
		userWithdraw(20);
	}

	public static void main(String[] args) {
		bankUser user = new bankUser();

		Thread t1 = new Thread(user);
		Thread t2 = new Thread(user);
		t1.start();
		t2.start();
	}
}
