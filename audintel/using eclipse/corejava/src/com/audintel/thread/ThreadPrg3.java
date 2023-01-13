package com.audintel.thread;

public class ThreadPrg3 {

	Runnable runnable = () -> {
		for (int i = 0; i < 20; i++) {
			System.out.println(i + "   " + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
				System.out.println("-------------------------");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	};

	public static void main(String[] args) {
		ThreadPrg3 prg2 = new ThreadPrg3();

		Thread thread1 = new Thread(prg2.runnable);
		Thread thread2 = new Thread(prg2.runnable);
		Thread thread3 = new Thread(prg2.runnable);

		thread1.start();
		thread2.start();
		thread3.start();
	}
}
