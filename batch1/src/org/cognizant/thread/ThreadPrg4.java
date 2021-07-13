package org.cognizant.thread;

public class ThreadPrg4 {

	public static void main(String[] args) {
		Runnable runnable1 = new Runnable() {
			@Override
			public void run() {
				for (int x = 1; x <= 20; x++)
					if( Thread.currentThread().getName().equals("task3"))
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					else
					System.out.println(x + "  child thread " + Thread.currentThread().getName());
			}
		};
		
		Runnable runnable =()->{
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
		t2.start();
		t3.start();

	}

}
