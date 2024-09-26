package com.montran.java8;

public class THreadPrg1 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(i + "   " + Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		THreadPrg1 prg1 = new THreadPrg1();
		Thread thread1 = new Thread(prg1);
		Thread thread2 = new Thread(prg1);
		Thread thread3 = new Thread(prg1);
		Thread thread4 = new Thread(prg1);

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}

}
