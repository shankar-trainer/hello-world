package com.capegemini.thread;

public class ThreadDemo2 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			if(getName().equals("task2") && i==3)
				try {
					System.out.println("Thread sleeping mode");
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			else
			System.out.println(i + "  " + getName());
		}
		}

	public ThreadDemo2(String s) {
		super(s);
		start();
	}

	public static void main(String[] args) {
		System.out.println("program start");

		new ThreadDemo2("task1");
		new ThreadDemo2("task2");
		new ThreadDemo2("task3");
		new ThreadDemo2("task4");

		System.out.println("program ends");
	}
}
