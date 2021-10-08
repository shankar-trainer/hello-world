package com.capgemini.thread;

public class ThreadJoin {

	public static void main(String[] args) throws InterruptedException {
		
		Runnable r1=()->{
			for (int i = 0; i <=10; i++) {
			System.out.println(i+"  "+Thread.currentThread().getName());
			}
		};
		
		
		Thread t1=new Thread(r1,"one");
		Thread t2=new Thread(r1,"two");
		Thread t3=new Thread(r1,"three");
		Thread t4=new Thread(r1,"four");
		
		t1.start();
		t1.join();
		
		t2.start();
		t3.start();
		t4.start();
	}
}
