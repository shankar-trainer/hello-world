package com.audintel.thread;

public class DeadLockMain {

	public static void main(String[] args) {
		Thread t1=  new Thread(new DeadLock1());
		t1.setName("User1");
		
		Thread t2=  new Thread(new DeadLock2());
		t2.setName("User2");
		
		t1.start();
		t2.start();
	}
}
