package com.capegemini.thread;

public class AccountThread2 implements Runnable {

	//synchronized 
	void increment() {
		// synchronized (this)
		System.out.print((Account.balance++) + "  ");
	}

	@Override
	public void run() {
		increment();
		increment();
		increment();
	}

	public static void main(String[] args) {
	AccountThread2	t=new AccountThread2();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		t1.start();
		t2.start();
		t3.start();
	}
}
