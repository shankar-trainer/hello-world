package com.abc;

public class ThreadEx1  implements Runnable{

	@Override
	public void run() {
		System.out.println("thread name "+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		
		ThreadEx1 ex1=new ThreadEx1(); 
		
		Thread t1=new Thread(ex1);
		Thread t2=new Thread(ex1);
		Thread t3=new Thread(ex1);
		Thread t4=new Thread(ex1);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
