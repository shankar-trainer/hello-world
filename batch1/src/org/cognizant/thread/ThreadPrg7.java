package org.cognizant.thread;

public class ThreadPrg7 {
	
	public static void main(String[] args) throws InterruptedException {

		Runnable runnable = () -> {
			for (int x = 1; x <= 20; x++)
				System.out.println(x + "  child thread " + Thread.currentThread().getName()+" priority  "+Thread.currentThread().getPriority());

		};

		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		Thread t3 = new Thread(runnable);
		
		t1.setName("task1");
		t2.setName("task2");
		t3.setName("task3");

		//t3.setPriority(10);
		t3.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();

	}

}
