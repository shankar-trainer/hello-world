package edu.chitkara.multithread;

import java.time.LocalTime;

public class ThreadQuestion1 extends Thread {
	@Override
	public void run() {
		System.out.println("Thread name " + getName());

		System.out.println("Current time " + LocalTime.now());
		try {
			Thread.sleep(10*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Current time " + LocalTime.now());
	}

	public static void main(String[] args) {
		Thread t = new ThreadQuestion1();
		// t.start();
		t.setName("MyThread");
		t.start();
	}
}
