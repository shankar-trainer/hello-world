package com.capegemini.thread;

public class Task1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println
			(i + "   " + getName()+"  priority  "+getPriority()+" group name   "+getThreadGroup().getName());
		}
	}
}
