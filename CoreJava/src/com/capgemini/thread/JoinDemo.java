package com.capgemini.thread;

class Task1 implements Runnable {

	static void hello() {
		System.out.println("hello..");
	}

	@Override
	public void run() {
		for (int x = 0; x <= 20; x++) {
			System.out.println(x + "  " + Thread.currentThread().getName());
			//hello();
		}
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		for (int x = 0; x <= 20; x++) {
			System.out.println(x + "  " + Thread.currentThread().getName());
			//Task1.hello();
		}
	}
}

class Task3 implements Runnable {

	@Override
	public void run() {
		for (int x = 0; x <= 20; x++) {
			System.out.println(x + "  " + Thread.currentThread().getName()+" priority   "+ Thread.currentThread().getPriority());
			//Task1.hello();
		}
	}
}

public class JoinDemo {
	public static void main(String[] args) throws InterruptedException {
      Thread t1=new Thread(new Task1());
      Thread t2=new Thread(new Task2());
      Thread t3=new Thread(new Task3());
      
      t1.start();
      t1.join();
      t2.start();
      t3.start();
	}
}
