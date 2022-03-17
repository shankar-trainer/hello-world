package com.capgemini.thread;

class Task1 extends Thread {
	@Override
	public void run() {
		synchronized (DeadLock.res1) {
			System.out.println(getName() + "  got " + DeadLock.res1);
			System.out.println(getName() + "  waiting for  " + DeadLock.res2);


			synchronized (DeadLock.res2) {
				System.out.println(getName() + "  got " + DeadLock.res2);
			}
		}
	}
}

class Task2 extends Thread {
	@Override
	public void run() {
		synchronized (DeadLock.res2) {
			System.out.println(getName() + "  got " + DeadLock.res2);
			System.out.println(getName() + "  waiting for  " + DeadLock.res1);
			synchronized (DeadLock.res1) {
				System.out.println(getName() + "  got " + DeadLock.res1);
			}
		}
	}
}

public class DeadLock {
	static String res1 = "keyboard";
	static String res2 = "printer";

	public static void main(String[] args) {
		Task1 t1 = new Task1();
		t1.setName("task1");
		
		Task2 t2 = new Task2();
		t2.setName("task2");
		
		t1.start();
		t2.start();
	}
}
