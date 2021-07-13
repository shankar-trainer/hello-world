package com.cts.thread;

public class ThreadPrg1 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println(i+" child thread  name " + getName());
		}
	}

	public static void main(String[] args) {

		System.out.println("main thread starts ");
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getName());

		System.out.println("main thread ends ");

		Thread t1 = new ThreadPrg1();
		Thread t2 = new ThreadPrg1();
		Thread t3 = new ThreadPrg1();
		Thread t4 = new ThreadPrg1();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
