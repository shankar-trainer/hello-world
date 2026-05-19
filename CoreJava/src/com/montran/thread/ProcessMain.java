package com.montran.thread;

public class ProcessMain {

	public static void main(String[] args) {
		
		Thread t1=new Thread(new Process1(),"work1");
		t1.start();
	
		new Thread(new Process2(),"work2").start();
		new Thread(new Process3(),"work3").start();

		
	}
}
