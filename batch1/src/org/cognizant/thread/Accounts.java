package org.cognizant.thread;

public class Accounts {
	static int x = 1;
}

class AccountsMain {
	synchronized 
	void increment() {
		System.out.print(Accounts.x + " , ");
		Accounts.x++;
	}

	Runnable runnable = () -> {
		increment();
		increment();
		increment();
	};

	public static void main(String[] args) {
		AccountsMain main = new AccountsMain();
		Thread t1 = new Thread(main.runnable);
		Thread t2 = new Thread(main.runnable);
		Thread t3 = new Thread(main.runnable);

		t1.start();
		t2.start();
		t3.start();
	}
}