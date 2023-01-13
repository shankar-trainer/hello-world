package com.nec.thread;

public class TaskMain {

	public static void main(String[] args) {
		Thread t1=new Thread(new Task1(),"process1");
		Thread t2=new Thread(new Task2(),"process2");
		Thread t3=new Thread(new Task3(),"process3");
		
		t1.setPriority(1);
		t2.setPriority(1);
		t3.setPriority(10);
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
