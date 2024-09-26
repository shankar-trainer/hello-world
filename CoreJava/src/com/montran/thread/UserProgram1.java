package com.montran.thread;

public class UserProgram1 {

	public static void main(String[] args) {

		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 20; i++) {
					System.out.println(i + "  " + Thread.currentThread().getName());
				}
			}
		};

		Thread t1 = new Thread(runnable, "p1");
		Thread t2 = new Thread(runnable, "p2");
		Thread t3 = new Thread(runnable, "p3");
		Thread t4 = new Thread(runnable, "p4");

		t1.setPriority(1);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		t4.setPriority(10);
		
		t1.start();
		/*try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
      */
		
		
		t2.start();
		t3.start();
		t4.start();

	}
}
