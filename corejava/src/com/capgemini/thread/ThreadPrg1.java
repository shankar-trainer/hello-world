package com.capgemini.thread;

public class ThreadPrg1 extends Thread {

	int x;
	int y;
	
	int addidition() {
		return x+y;
	}
	
	@Override
	public void run() {
		for (int i = 0; i <= 30; i++) {
			System.out.println(i + " child thread  name " + getName()+"   priority  "+getPriority());
			System.out.println(addidition());
		}
	}

	public static void main(String[] args) {
		System.out.println("main program starts "+Thread.currentThread().getPriority());
		System.out.println("main thread name " + Thread.currentThread().getName());

		ThreadPrg1 t1 = new ThreadPrg1();
		Thread t2 = new ThreadPrg1();
		Thread t3 = new ThreadPrg1();
		
		t1.x=10;
		t1.y=20;
		
		
		t1.setName("task1");
		t2.setName("task2");
		t3.setName("task3");

		t1.start();
		t2.start();
		t3.start();
		System.out.println("main program ends ");
	}
}
