package com.capegemini.java8;

public class MyThreadDemo {
	public static void main(String[] args) {
		/*
		 * Runnable runnable2 = new Runnable() {
		 * 
		 * @Override public void run() { for (int x = 1; x <= 20; x++)
		 * System.out.println(x + " " + Thread.currentThread().getName()); } };
		 */
		Runnable runnable =()->{
			for (int x = 1; x <= 20; x++)
				System.out.println(x + " " 
			+ Thread.currentThread().getName());
		};
		
		Thread t1=new Thread(runnable);
		Thread t2=new Thread(runnable);
		Thread t3=new Thread(runnable);
		t1.start();t2.start();t3.start();
	}
}
