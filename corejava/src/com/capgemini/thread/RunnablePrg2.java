package com.capgemini.thread;


public class RunnablePrg2 implements Runnable {

	@Override
	public void run() {
		for (int x = 1; x <= 30; x++) {
			if(x%5==0)
				try {
					System.out.println("sleeping ...........");
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			
			System.out.println("child thread running " + Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		System.out.println("main thread running");
		RunnablePrg2 prg1 = new RunnablePrg2();

		// Thread t1=new Thread(prg1);
		Thread t1 = new Thread(prg1, "process1");

		Thread t2 = new Thread(prg1,"process2");
		Thread t3 = new Thread(prg1,"process3");

		t1.start();
		// t1.start();// thread is already started , throw IllegalStateException
		t2.start();
		t3.start();

		System.out.println("main thread running");
	}
}
