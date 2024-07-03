package com.abc;

public class ThreadEx2{

	public static void main(String[] args) {
		Runnable r=new Runnable() {
			@Override
			public void run() {
				System.out.println("thread name "+Thread.currentThread().getName());
				
			}
		}; 
		
		Thread t1=new Thread(r);
		Thread t2=new Thread(r);
		Thread t3=new Thread(r);
		Thread t4=new Thread(r);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
