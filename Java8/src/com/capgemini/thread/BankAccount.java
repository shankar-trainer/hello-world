package com.capgemini.thread;

class Bank {
	static float balance = 6000;
	static void withdraw(float amt) {
		balance = balance - amt;
	}
}

public class BankAccount {

	static 
	//synchronized
	void makewithdraw(int amt) {
		if (amt > Bank.balance)
			System.out.println("cannot withdraw balance is " + Bank.balance);
		else {
			Bank.withdraw(amt);
			System.out.println("after withdraw balance is " + Bank.balance);
		}
	}

	public static void main(String[] args) {
		Runnable r1 = () -> {
			for (int k = 1; k <= 3; k++) {
				makewithdraw(1000);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		Thread t3 = new Thread(r1);
		t1.start();
		t2.start();
		t3.start();
	}
}
