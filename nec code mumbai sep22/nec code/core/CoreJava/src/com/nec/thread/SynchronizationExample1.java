package com.nec.thread;

class Account {
	static int x = 0;

}

public class SynchronizationExample1 implements Runnable {

	synchronized void increment() {
		System.out.print("," + Account.x++);
	}

	@Override
	public void run() {
		for (int i = 0; i <= 2; i++) {
			increment();
		}
	}

	public static void main(String[] args) {

		SynchronizationExample1 example1 = new SynchronizationExample1();
		Thread t1 = new Thread(example1);
		Thread t2 = new Thread(example1);
		Thread t3 = new Thread(example1);
		Thread t4 = new Thread(example1);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
