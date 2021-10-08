package com.capgemini.thread;

import javax.swing.JFrame;

public class ThreadExample2  extends JFrame  implements Runnable {
	Thread t1;

	@Override
	public void run() {
		t1 = Thread.currentThread();
		System.out.println("\nchild thread running ");
		for (int i = 0; i <= 10; i++)
			System.out.println(i + " thread name  " + t1.getName());

	}

	public static void main(String[] args) {

		ThreadExample2 runnable = new ThreadExample2();

		Thread t1 = new Thread(runnable);
		t1.setName("process1");
		Thread t2 = new Thread(runnable,"process2");
		Thread t3 = new Thread(runnable);
		Thread t4 = new Thread(runnable,"process4");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
