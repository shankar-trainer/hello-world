package com.nec.thread;

class Task1 implements Runnable {
	Thread t;

	@Override
	public void run() {
		for (int i = 0; i <= 25; i++) {
			t = Thread.currentThread();
			System.out.println(i + "\tname   " + t.getName() + "\tpriority   " + t.getPriority());
		}
	}
}
class Task2 implements Runnable {
	Thread t;
	
	@Override
	public void run() {
		for (int i = 0; i <= 25; i++) {
			t = Thread.currentThread();
			System.out.println(i + "\tname   " + t.getName() + "\tpriority   " + t.getPriority());
		}
	}
	
}
class Task3 implements Runnable {
	Thread t;
	
	@Override
	public void run() {
		for (int i = 0; i <= 25; i++) {
			t = Thread.currentThread();
			System.out.println(i + "\tname   " + t.getName() + "\tpriority   " + t.getPriority());
		}
	}
}
