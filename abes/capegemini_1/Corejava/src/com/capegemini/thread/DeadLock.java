package com.capegemini.thread;

class Resource {
	static String res1 = "keyboard";
	static String res2 = "printer";
}

class Printing extends Thread {
	@Override
	public void run() {
		
		synchronized (Resource.res2) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("got printer waiting for keyboard");
			synchronized (Resource.res1) {
				System.out.println("got printer and keyboard");
			}
		}
	}
}

class Keyboard extends Thread {
	@Override
	public void run() {
		synchronized (Resource.res1) {
			System.out.println("got keyboard waiting for printer");
			synchronized (Resource.res2) {
				System.out.println("got keyboard and printer both");
			}
		}
	}
}

public class DeadLock {
	public static void main(String[] args) {
		new Printing().start();
		new Keyboard().start();
	}

}
