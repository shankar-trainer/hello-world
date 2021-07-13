package com.cts.thread;

public class RunnablePrg1 implements Runnable {

	@Override
	public void run() {
		for (int i =1; i <30; i++) {
			System.out.println(i+"  "+Thread.currentThread().getName());
		}		
	}

	public static void main(String[] args) {
		RunnablePrg1 prg1 = new RunnablePrg1();
		Thread t1 = new Thread(prg1);
		Thread t2 = new Thread(prg1);
		Thread t3 = new Thread(prg1);
		
		t1.setName("task1");
		t2.setName("task2");
		t3.setName("task3");

		t1.start();
		t2.start();
		t3.start();
	}
}
