package com.capegemini.thread;

public class DaemonThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 20; i++)
			System.out.println(i + "  " + getName() + "  Child Thread  gr name  " + getThreadGroup().getName());
	}

	public DaemonThread(ThreadGroup group, String name) {
		super(group, name);
		start();
	}

	public static void main(String[] args) {

		ThreadGroup group1 = new ThreadGroup("high imp");
		ThreadGroup group2 = new ThreadGroup("low imp");

		System.out.println("Main Thread Running");

		DaemonThread daemonThread = new DaemonThread(group1, "daemon");

		DaemonThread t1 = new DaemonThread(group1, "worker1");
		DaemonThread t2 = new DaemonThread(group1, "worker2");
		DaemonThread t3 = new DaemonThread(group1, "worker3");
		DaemonThread t4 = new DaemonThread(group1, "worker4");
		DaemonThread t5 = new DaemonThread(group2, "worker5");
		DaemonThread t6 = new DaemonThread(group2, "worker6");
		DaemonThread t7 = new DaemonThread(group2, "worker7");
		DaemonThread t8 = new DaemonThread(group2, "worker8");
		DaemonThread t9 = new DaemonThread(group2, "worker9");

		System.out.println("Main Thread Ends");

	}
}
