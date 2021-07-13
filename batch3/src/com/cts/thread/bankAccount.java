package com.cts.thread;

public class bankAccount {

	private int balance;

	public bankAccount(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public synchronized void deposit(int amt) {
		balance = balance + amt;
	}

	public synchronized void withdraw(int amt) {
		balance = balance - amt;
	}

	public static void main(String[] args) {
		Runnable r1 = () -> {
			bankAccount account = new bankAccount(12000);
			System.out.println("\nAccount name " + Thread.currentThread().getName());
			System.out.println("initial balance is " + account.balance);
			account.deposit(3000);
			System.out.println("after deposit  balance is " + account.balance);
			account.withdraw(500);
			System.out.println("after withdraw  balance is " + account.balance);
		};

		Thread t1 = new Thread(r1);
		t1.setName("ram kumar");

		Thread t2 = new Thread(r1);
		t2.setName("shyam kumar");

		Thread t3 = new Thread(r1);
		t3.setName("arvind kumar");

		t1.start();
		t2.start();
		t3.start();
	}

}
