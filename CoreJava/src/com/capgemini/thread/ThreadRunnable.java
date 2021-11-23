package com.capgemini.thread;

import java.util.Iterator;

public class ThreadRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(i + "  " + Thread.currentThread().getName());
		  if(i>=10 && Thread.currentThread().getName().equals("process1") )
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ThreadRunnable runnable = new ThreadRunnable();
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		Thread t3 = new Thread(runnable);
		
		t1.setName("process1");
		t2.setName("process2");
		t3.setName("process3");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
