package com.montran.thread.synch;

public class Account {
	int balance = 30;

	void withdraw(int amt) {
		balance = balance - amt;
	}
}

class MyAccount implements Runnable {
	Account act;

	public MyAccount() {
		act = new Account();
	}

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			try {
				makewithdraw(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	synchronized void makewithdraw(int amt) throws InterruptedException {
		if (act.balance >= 10) {
			System.out.println("withdrawing " + amt + " balance is " + act.balance);
			// Thread.sleep(500);
			act.withdraw(amt);
		} else
			System.out.println("cannot withdraw");
	}

	public static void main(String[] args) {
		MyAccount account = new MyAccount();
		Thread t1 = new Thread(account);
		Thread t2 = new Thread(account);
		Thread t3 = new Thread(account);
		t1.start();
		t2.start();
		t3.start();
	}
}
