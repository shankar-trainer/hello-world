package com.cts.thread;

public class ThreadEx2 implements Runnable {

	Thread cthread;

	void addition(int a, int b) {
		System.out.println(a + b);
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			cthread = Thread.currentThread();

			System.out.println(cthread.getName() + "  " + cthread.getPriority() + "  ");
			addition(i, i + 10);
		}

	}

	public static void main(String[] args) {
		ThreadEx2 ex2 = new ThreadEx2();

		Thread thread1 = new Thread(ex2);
		Thread thread2 = new Thread(ex2);
		Thread thread3 = new Thread(ex2);

		thread1.start();
		thread2.start();
		thread3.start();
	}
}
