package com.capgemini.thread;

public class ThreadExample2 extends Thread {
	@Override
	public void run() {
		for(int x=1;x<=30;x++)
		System.out.println(x+"  Child thread runs "+getName());
	}

	public static void main(String[] args) {

		System.out.println("main thread starts");

		ThreadExample2 t1 = new ThreadExample2();
		ThreadExample2 t2 = new ThreadExample2();
		ThreadExample2 t3 = new ThreadExample2();

		t1.setName("task1");
		t2.setName("task2");
		t3.setName("task3");
		
		t1.start();
		t2.start();
		t3.start();

		System.out.println("main thread ends ");

	}

}
