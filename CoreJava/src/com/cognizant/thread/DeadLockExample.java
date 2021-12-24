package com.cognizant.thread;

class User1 implements Runnable {
	static final String resource1 = "keyboard";
	static final String resource2 = "printer";

	@Override
	public void run() {
           synchronized (resource1) {
			System.out.println("User1 has aquired "+resource1);

	           synchronized (resource2) {
				System.out.println("User1 is waiting for  "+resource2);
			}
           }
	}
}

class User2 implements Runnable {
	@Override
	public void run() {
        synchronized (User1.resource2) {
			System.out.println("User2 has aquired "+User1.resource2);

	           synchronized (User1.resource1) {
				System.out.println("User1 is waiting for  "+User1.resource1);
			}
        }
	}
}

public class DeadLockExample {
  public static void main(String[] args) {
	Thread t1=new Thread(new User1());
	Thread t2=new Thread(new User2());
    t1.start();	  
    t2.start();	  
     	  
   }
}
