package com.audintel.thread;

public class ThreadPriority {
	Thread t;

	Runnable runnable = () -> {
		t = Thread.currentThread();
		for (int i = 0; i < 20; i++) {
			System.out.println(i + " child thread   " + t.getName() + " priority " + t.getPriority());
		}
	};

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Thread starts ");

		Thread currentThread = Thread.currentThread();
		System.out.println("main Thread " + currentThread);
		System.out.println("main Thread name " + currentThread.getName());
		System.out.println("main Thread Priority " + currentThread.getPriority());

		ThreadPriority prg2 = new ThreadPriority();

		Thread thread1 = new Thread(prg2.runnable, "Process1");
		Thread thread2 = new Thread(prg2.runnable, "Process2");
		Thread thread3 = new Thread(prg2.runnable, "Process3");
		// thread1.setPriority(10);
		
		thread1.setPriority(Thread.MAX_PRIORITY);
		thread2.setPriority(Thread.MIN_PRIORITY);
		thread3.setPriority(Thread.MIN_PRIORITY);

		thread3.start();
		thread2.start();
		thread1.start();

		System.out.println("Thread ends  ");
	}
}
