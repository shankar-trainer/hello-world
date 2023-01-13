package com.nec.thread;

class BankAccount {
	private float balance = 30;

	public void deposit(float amt) {
		balance = balance + amt;
	}

	public void withdraw(float amt) {
		balance = balance - amt;
	}

	public float getBalance() {
		return balance;
	}
}

public class SynchronizationExample2 implements Runnable {
	BankAccount account = new BankAccount();

synchronized	void makeWithdraw(BankAccount act) {
		if (act.getBalance() <= 0)
			System.out.println("cannot be withdrawn balance is insufficeint "+act.getBalance());
		else {
			act.withdraw(10);
			System.out.println("account is  withdrawn balance is  " + act.getBalance());
		}
	}

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			makeWithdraw(account);
		}
	}

	public static void main(String[] args) {
		SynchronizationExample2 example2 = new SynchronizationExample2();

		Thread user1 = new Thread(example2);
		Thread user2 = new Thread(example2);
		Thread user3 = new Thread(example2);
		Thread user4 = new Thread(example2);
		user1.start();
		user2.start();
		user3.start();
		user4.start();
	}

}
