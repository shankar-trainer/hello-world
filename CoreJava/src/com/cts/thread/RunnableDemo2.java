package com.cts.thread;

public class RunnableDemo2 {

	public static void main(String[] args) {
		System.out.println("main thread starts");

		Runnable runnable = () -> {
			for (int i = 0; i < 21; i++) {
				System.out.println(i + "  child thread  " + Thread.currentThread().getName());
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		Thread t3 = new Thread(runnable);

		t1.setName("task1");
		t2.setName("task2");
		t3.setName("task3");

		t1.start();
		t2.start();
		t3.start();

		System.out.println("main thread ends");

	}
}
