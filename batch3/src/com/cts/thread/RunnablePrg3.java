package com.cts.thread;

public class RunnablePrg3  {

	public static void main(String[] args) throws InterruptedException {
		Runnable r1=()->{
			for (int i =1; i <30; i++) 
				System.out.println(i+"  "+Thread.currentThread().getName());
		};
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		Thread t3 = new Thread(r1);
		
		t1.setName("task1");
		t2.setName("task2");
		t3.setName("task3");
		
		t1.start();
		t1.join();
		t2.start();
		t3.start();
	}
}
