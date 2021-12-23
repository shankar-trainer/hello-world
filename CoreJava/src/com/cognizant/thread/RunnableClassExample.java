package com.cognizant.thread;

import com.cognizant.error.Employee;

public class RunnableClassExample extends Employee implements Runnable {

	Thread t1;

	@Override
	public void run() {
		t1 = Thread.currentThread();
		for (int i = 0; i <= 30; i++) {
			System.out.println("child thread " + t1.getName());
         /*
   			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		*/
		}
	}

	public static void main(String[] args) throws InterruptedException {
		RunnableClassExample example = new RunnableClassExample();
		Thread t1 = new Thread(example);
		Thread t2 = new Thread(example);
		Thread t3 = new Thread(example);
		Thread t4 = new Thread(example);

		t1.start();
		
		t1.join();
		
		t2.start();
		t3.start();
		t4.start();
	}
}
