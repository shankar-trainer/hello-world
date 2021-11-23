package com.capgemini.thread;

public class ThreadExaamplePriority extends Thread {
	@Override
	public void run() {
		for (int x = 1; x <= 30; x++)
			System.out.println(x + "  Child thread runs " + getName());
	}

	public static void main(String[] args) {

		System.out.println("main thread starts");

		ThreadExaamplePriority t1 = new ThreadExaamplePriority();
		ThreadExaamplePriority t2 = new ThreadExaamplePriority();
		ThreadExaamplePriority t3 = new ThreadExaamplePriority();

		t1.setName("task1");
		t2.setName("task2");
		t3.setName("task3");

		t3.setPriority(10);
		t2.setPriority(1);
		t1.setPriority(1);

		t1.start();
		t2.start();
		t3.start();

		System.out.println("main thread ends ");

	}

}
