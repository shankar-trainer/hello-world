package com.capegemini.thread;

public class ThreadDemo1 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <=20; i++) 
		System.out.println(i+"  " + getName());
	}

	public static void main(String[] args) {
		System.out.println("program start");

		Thread thread1 = new ThreadDemo1();
		Thread thread2 = new ThreadDemo1();
		Thread thread3 = new ThreadDemo1();
		Thread thread4 = new ThreadDemo1();
		thread1.setName("task 1");
		thread2.setName("task 2");
		thread3.setName("task 3");
		thread4.setName("task 4");

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();

		System.out.println("program ends");
	}
}
