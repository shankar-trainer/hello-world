package com.montran.thread;

class Kid1 implements Runnable {
	static final String s1 = "book";
	static final String s2 = "pen";

	@Override
	public void run() {
		synchronized (s1) {
			System.out.println("kid1 got lock over " + s1 + " waiting for " + s2);
			  try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (s2) {
				System.out.println("kid1 got lock " + s2);
			}
		}
	}
}

class Kid2 implements Runnable {

	@Override
	public void run() {
		synchronized (Kid1.s2) {
			System.out.println("kid2 got lock over " + Kid1.s2 + " waiting for " + Kid1.s1);
			synchronized (Kid1.s1) {
				System.out.println("kid2 got lock " + Kid1.s1);
			}
		}
	}
}

public class DeadLock {
	public static void main(String[] args) {
		new Thread(new Kid1()).start();
		new Thread(new Kid2()).start();
	}
}
