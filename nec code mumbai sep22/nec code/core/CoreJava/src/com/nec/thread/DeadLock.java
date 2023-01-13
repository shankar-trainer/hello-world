package com.nec.thread;

class User1 extends Thread {
	static String res1 = "keyboard";
	static String res2 = "printer";

	@Override
	public void run() {
		synchronized (res1) {
			System.out.println(getName() + " got lock over " + res1);
			synchronized (res2) {
				System.out.println(getName() + " waiting  for  " + res2);
			}
		}
	}
}

class User2 extends Thread {

	@Override
	public void run() {
		synchronized (User1.res2) {
			System.out.println(getName() + " got lock over " + User1.res2);
			synchronized (User1.res1) {
				System.out.println(getName() + " waiting  for  " + User1.res1);
			}
		}
	}
}


public class DeadLock {

	public static void main(String[] args) {
		new User1().start();
		new User2().start();
		
		
	}
}
