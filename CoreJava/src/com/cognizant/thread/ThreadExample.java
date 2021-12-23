package com.cognizant.thread;

public class ThreadExample extends Thread {

	@Override
	public void run() {
		for (int x = 0; x <= 30; x++)
			System.out.println(x + " child process " + getName()+"  priority "+getPriority());
	}

	public static void main(String[] args) {
		System.out.println("main thread starts ... priority  "+Thread.currentThread().getPriority());

		Thread t1 = new ThreadExample();
		Thread t2 = new ThreadExample();
		Thread t3 = new ThreadExample();

		t1.setName("task1");
		t2.setName("task2");
		t3.setName("task3");
		
		t3.setPriority(10);
		t1.setPriority(1);
		t2.setPriority(2);
		
		t1.start();
		t2.start();
		t3.start();
		System.out.println("main thread ends");
	}
}
