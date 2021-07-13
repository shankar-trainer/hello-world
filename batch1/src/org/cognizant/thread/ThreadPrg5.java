package org.cognizant.thread;

public class ThreadPrg5 {

	
	public static void main(String[] args) throws InterruptedException {

		Runnable runnable = () -> {
			for (int x = 1; x <= 20; x++)
				System.out.println(x + "  child thread " + Thread.currentThread().getName());

		};

		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		Thread t3 = new Thread(runnable);
		t1.setName("task1");
		t2.setName("task2");
		t3.setName("task3");

		t1.start();
		t1.join();

		t2.start();
		t3.start();

	}

}
