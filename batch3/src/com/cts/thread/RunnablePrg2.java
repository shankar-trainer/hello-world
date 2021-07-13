package com.cts.thread;

public class RunnablePrg2  {

	public static void main(String[] args) {
		/*Runnable r1=new Runnable() {
			@Override
			public void run() {
				for (int i =1; i <30; i++) 
					System.out.println(i+"  "+Thread.currentThread().getName());
			}
		};
		*/
		Runnable r1=()->{
			for (int i =1; i <30; i++) {
				System.out.println(i+"  "+Thread.currentThread().getName());
			  try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
		};
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		Thread t3 = new Thread(r1);
		
		t1.setName("task1");
		t2.setName("task2");
		t3.setName("task3");

		t1.start();
		t2.start();
		t3.start();
	}
}
