package com.capegemini.thread;

public class AccountThread extends Thread {

	synchronized void increment() {
		// synchronized (this)
		{
			System.out.print((Account.balance++) + "  ");
		}
	}

	@Override
	public void run() {
		increment();
		increment();
		increment();
	}

	public static void main(String[] args) {
		Thread t1 = new AccountThread();
		Thread t2 = new AccountThread();
		Thread t3 = new AccountThread();
		t1.start();
		t2.start();
		t3.start();
	}
}
