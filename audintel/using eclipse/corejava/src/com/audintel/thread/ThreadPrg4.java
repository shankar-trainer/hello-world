package com.audintel.thread;

public class ThreadPrg4 {

	Runnable runnable = () -> {
		for (int i = 0; i < 20; i++) {
			System.out.println(i + "   " + Thread.currentThread().getName());
			
		}
	};

	public static void main(String[] args) throws InterruptedException {
		ThreadPrg4 prg2 = new ThreadPrg4();

		Thread thread1 = new Thread(prg2.runnable);
		Thread thread2 = new Thread(prg2.runnable);
		Thread thread3 = new Thread(prg2.runnable);

		thread1.start();
		thread1.join();
		
		thread2.start();
		thread3.start();
	}
}
