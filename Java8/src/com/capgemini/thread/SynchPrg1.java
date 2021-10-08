package com.capgemini.thread;

class Account {
	static int x = 1;
}

public class SynchPrg1 {

	static
	//synchronized
	void increment() {
		
		System.out.println(Account.x++);
	}

	public static void main(String[] args) {
		Runnable r1 = () -> {
			for (int k = 1; k <= 3; k++)
				increment();
		};

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		Thread t3 = new Thread(r1);
		t1.start();
		t2.start();
		t3.start();
	}
}
