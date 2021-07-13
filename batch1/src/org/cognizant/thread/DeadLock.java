package org.cognizant.thread;

class MyThread1 {
	static String res1 = "printer";
	static String res2 = "keyboard";
	Runnable r1 = () -> {
		synchronized (res1) {
			System.out.println(res1 + " blocked waiting for " + res2);
			synchronized (res2) {
				System.out.println(res2 + " blocked ");
			}

		}

	};
}

class MyThread2 {
	Runnable r2 = () -> {
		synchronized (MyThread1.res2) {
			System.out.println(MyThread1.res2 + " blocked waiting for " +MyThread1.res1);
			synchronized (MyThread1.res1) {
				System.out.println(MyThread1.res2 + " blocked ");
			}
		}
	};
}

public class DeadLock {
 public static void main(String[] args) {
	
	 Thread t1=new Thread(new MyThread1().r1);
	 Thread t2=new Thread(new MyThread2().r2);
	 t1.start();
	 t2.start();
}
}
