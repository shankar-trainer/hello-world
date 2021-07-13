package org.cognizant.thread;

public class ThreadPrg3 implements Runnable {

	Thread t1;

	@Override
	public void run() {
		t1 = Thread.currentThread();
		for (int x = 1; x <= 20; x++)
			System.out.println(x + "  child thread " + t1.getName());

	}

	public static void main(String[] args) {
		ThreadPrg3 th = new ThreadPrg3();
		Thread t1 = new Thread(th);
		Thread t2 = new Thread(th);
		Thread t3 = new Thread(th);

		t1.setName("task1");
		t2.setName("task2");
		t3.setName("task3");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
