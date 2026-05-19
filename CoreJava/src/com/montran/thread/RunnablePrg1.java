package com.montran.thread;

public class RunnablePrg1 implements Runnable {
	Thread t1;

	@Override
	public void run() {
		t1 = Thread.currentThread();
		for (int i = 0; i <= 20; i++) {
			System.out.println(i + "  " + t1.getName());
		}
	}
	
	public static void main(String[] args) {
		RunnablePrg1 prg1=new RunnablePrg1();
		
		Thread t1=new Thread(prg1);
		t1.setName("task1");
		Thread t2=new Thread(prg1,"task2");
		Thread t3=new Thread(prg1,"task3");
		t1.start();
		t2.start();
		t3.start();
	}

}
