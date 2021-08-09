package com.montran.thread;

public class Process1 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 20; i++) {
			if(i>5 && i<15)
			{
			System.out.println(i + "  " + Thread.currentThread().getName());
			 Thread.yield();
			}
		}
	}
}
