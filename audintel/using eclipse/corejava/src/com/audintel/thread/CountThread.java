package com.audintel.thread;

class CountThread implements Runnable {

	@Override
	public void run() {
		increment();
		increment();
		increment();
	}

	synchronized
	void increment() {
		System.out.print(Counts.x++ + ", ");
	}

	public static void main(String[] args) {
		CountThread countThread1 = new CountThread();
		new Thread(countThread1).start();
		new Thread(countThread1).start();
		new Thread(countThread1).start();
		}
}