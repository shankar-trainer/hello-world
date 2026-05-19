package com.montran.thread;

public class Process3 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 20; i++) {
			System.out.println(i + "  " + Thread.currentThread().getName());
		}
	}
}
