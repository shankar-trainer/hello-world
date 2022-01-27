package com.montran.java8;

public class THreadPrg2  {
	public static void main(String[] args) {
		Runnable runnable=()->{
			for (int i = 0; i < 20; i++) 
				System.out.println(i + "   " + Thread.currentThread().getName());
		};
		
		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);
		Thread thread3 = new Thread(runnable);
		Thread thread4 = new Thread(runnable);

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}
}
