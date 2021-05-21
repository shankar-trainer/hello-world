package com.cts.thread;

public class RunnableDemo3 {

	public static void main(String[] args) 
	{
		Runnable runnable = () -> {
			for (int i = 0; i <21; i++) {
					System.out.println(i + "   " + Thread.currentThread().getName()+"  "+Thread.currentThread().getPriority());
			}
		};

		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		Thread t3 = new Thread(runnable);

		t1.setName("task1");
		t2.setName("task2");
		t3.setName("task3");

		t1.setPriority(1);
		
		//t1.setPriority(Thread.MIN_PRIORITY);
		
		t3.setPriority(10);
		//t3.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
