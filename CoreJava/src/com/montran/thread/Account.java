package com.montran.thread;

public class Account {
	static int balance = 1;
}

class Accountmain implements Runnable {

	synchronized void increment() {
		System.out.print(Account.balance++ + " , ");
	}
	
	/*	
	void increment() {
		synchronized(this) {
		System.out.print(Account.balance++ + " , ");
		}
	}*/
	
	@Override
	public void run() {
		increment();
		increment();
		increment();
	}

	public static void main(String[] args) {
		Accountmain accountmain = new Accountmain();
		new Thread(accountmain).start();
		new Thread(accountmain).start();
		new Thread(accountmain).start();
	}

}