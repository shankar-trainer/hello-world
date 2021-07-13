package org.cognizant.thread;

public class ThreadPrg6 {
	Thread t1;

	public ThreadPrg6(Runnable runnable, String name) {
		t1 = new Thread(runnable, name);
		t1.start();
	}

	public static void main(String[] args) throws InterruptedException {

		Runnable runnable = () -> {
			for (int x = 1; x <= 20; x++)
				System.out.println(x + "  child thread " + Thread.currentThread().getName());

		};

		new ThreadPrg6(runnable, "process1");
		new ThreadPrg6(runnable, "process2");
		new ThreadPrg6(runnable, "process3");
		
		
	}

}
