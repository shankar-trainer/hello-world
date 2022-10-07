package com.montran.thread;

public class Program2 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(i + " child thread  " + getName());
		}
	}

	public static void main(String[] args) {

		System.out.println("main thread starts running");
		Program2 program1=new Program2();
		Program2 program2=new Program2();
		
		Thread program3=new Program2();
		
		program1.setName("task1");
		program2.setName("task2");
		program3.setName("task3");
		
		program1.start();
		program2.start();
		program3.start();
		
		System.out.println("main thread is ending");
	}
}
