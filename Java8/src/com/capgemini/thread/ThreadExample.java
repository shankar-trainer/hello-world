package com.capgemini.thread;

public class ThreadExample extends Thread {
	@Override
	public void run() {
		System.out.println("\nchild thread running ");
		for (int i = 0; i <=10; i++) 
		System.out.println(i+" thread name  " + getName());
	}

	public static void main(String[] args) {

		System.out.println("main thread started");
		System.out.println(Thread.currentThread());

		System.out.println("main thread stop");

		Thread t1 = new ThreadExample();
		Thread t2 = new ThreadExample();
		Thread t3 = new ThreadExample();
		// t1.run();
		
		t2.setName("task2");
		t3.setName("task3");

		t1.start();
		t2.start();
		t3.start();
	}
}
