package com.capgemini.thread;

public class ThreadSleep {

	public static void main(String[] args) {
		
		Runnable r1=()->{
			for (int i = 0; i <=10; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			System.out.println(i+"  "+Thread.currentThread().getName()+"  Priority "+Thread.currentThread().getPriority());
			}
		};
		
		
		Thread t1=new Thread(r1,"one");
		Thread t2=new Thread(r1,"two");
		Thread t3=new Thread(r1,"three");
		Thread t4=new Thread(r1,"four");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
