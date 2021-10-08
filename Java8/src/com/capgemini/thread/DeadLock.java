package com.capgemini.thread;

public class DeadLock {

	static final String res1 = "printer";
	static final String res2 = "scanner";

	public static void main(String[] args) {

		Runnable r1 = () -> {
			synchronized (res1) {
				System.out.println("thread1 got lock over " + res1);
				synchronized (res2) {
					System.out.println("thread1 waiting for  " + res2);
				}
			}
		};
		Runnable r2 = () -> {
			synchronized (res2) {
				System.out.println("thread2 got lock over " + res2);
				synchronized (res1) {
					System.out.println("thread2 waiting for  " + res1);
				}
			}
		};

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);

		t1.start();
		t2.start();

	}

}
