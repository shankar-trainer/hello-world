package com.capegemini.thread;

class ImplementsRunnable implements Runnable {

	private int counter = 0;

	public void run() {
		counter++;
		System.out.println("ImplementsRunnable : Counter : " + counter);
	}
}

class ExtendsThread extends Thread {

	private int counter = 0;

	public void run() {
		counter++;
		System.out.println("ExtendsThread : Counter : " + counter);
	}
}

 public class ThreadVsRunnable {

	public static void main(String args[]) throws Exception {
 		ImplementsRunnable rc = new ImplementsRunnable();
		Thread t1 = new Thread(rc);
		t1.start();
	 
		Thread t2 = new Thread(rc);
		t2.start();
		Thread t3 = new Thread(rc);
		t3.start();

		ExtendsThread tc1 = new ExtendsThread();
		tc1.start();
		ExtendsThread tc2 = new ExtendsThread();
		tc2.start();
		ExtendsThread tc3 = new ExtendsThread();
		tc3.start();
	}
}