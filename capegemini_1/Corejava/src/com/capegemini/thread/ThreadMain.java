package com.capegemini.thread;

public class ThreadMain {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("main Thread Priority  "+Thread.currentThread().getPriority());
		
		Thread thread1 = new Task1();
		Thread thread2 = new Task2();
		Thread thread3 = new Task3();
		thread1.setName("process1");
		thread2.setName("process2");
		thread3.setName("process3");
		
		//thread3.setPriority(10);
		thread3.setPriority(Thread.MAX_PRIORITY);
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread2.setPriority(2);
		
		thread1.start();
		//thread1.join();
		thread2.start();
		thread3.start();
		
	}
}
