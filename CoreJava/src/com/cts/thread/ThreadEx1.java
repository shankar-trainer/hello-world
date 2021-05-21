package com.cts.thread;

public class ThreadEx1   extends Thread {

	@Override
	public void run() {
	    for (int i = 1; i <=20; i++) {
			System.out.println(i+" child thread "+getName());
		}
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("program starts ");

		System.out.println(Thread.currentThread());
		
		Thread thread1=new ThreadEx1();
		ThreadEx1 thread2=new ThreadEx1();
		Thread thread3=new ThreadEx1();
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		System.out.println("program ends ");
	}
}
