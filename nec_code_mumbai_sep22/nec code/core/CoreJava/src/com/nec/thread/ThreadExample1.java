package com.nec.thread;

public class ThreadExample1 extends Thread {

	@Override
	public void run() {
		for(int x=1;x<=20;x++)
		  System.out.println(x+" \t"+getName());
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("program starts ");
		
	 //    Thread t1=new ThreadExample1();	
	     ThreadExample1 t1=new ThreadExample1();	
	     ThreadExample1 t2=new ThreadExample1();	
	     ThreadExample1 t3=new ThreadExample1();	
		
	     t1.setName("task1");
	     t2.setName("task2");
	     t3.setName("task3");
	     
	     t1.start();

	     try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	     
	     
	     t2.start();
	     t3.start();
		
		System.out.println("program ends ");
	}
}
