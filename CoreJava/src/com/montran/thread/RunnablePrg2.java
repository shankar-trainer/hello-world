package com.montran.thread;

public class RunnablePrg2 {
	public static void main(String[] args) {
		Runnable runnable = new Runnable() {
			Thread t1;

			@Override
			public void run() {
				t1 = Thread.currentThread();
				for (int i = 0; i <= 20; i++) {
					try {
						if(t1.getName().equals("task1"))
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println(i + "  " + t1.getName());
				}
			}
		};

		Thread t1 = new Thread(runnable);
		t1.setName("task1");
		Thread t2 = new Thread(runnable, "task2");
		Thread t3 = new Thread(runnable, "task3");
		t1.start();
		t2.start();
		t3.start();
	}

}
