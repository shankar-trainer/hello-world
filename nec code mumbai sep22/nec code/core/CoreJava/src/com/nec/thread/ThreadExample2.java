package com.nec.thread;

public class ThreadExample2 implements Runnable {

	Thread t;

	@Override
	public void run() {
		for (int i = 0; i <= 25; i++) {
			t = Thread.currentThread();
			System.out.println(i + "\tname   " + t.getName() + "\tpriority   " + t.getPriority());
			if(i%3==0) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		ThreadExample2 example2=new ThreadExample2();
		
		Thread t1=new Thread(example2);
		t1.setName("process1");
		Thread t2=new Thread(example2,"process2");
		Thread t3=new Thread(example2,"process3");
		Thread t4=new Thread(example2,"process4");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
