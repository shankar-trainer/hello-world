package edu.chitkara.multithread;

public class MyThread1 implements Runnable {
	String city[] = { "rajpura", "patiyala", "amritsar", "chandigarh", "ludhiyana" };

	Thread t1;

	@Override
	public void run() {
		for (int i = 0; i < city.length; i++) {
			t1 = Thread.currentThread();
			System.out.println(i + " " + t1.getName() + " " + city[i]);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		MyThread1 myThread1 = new MyThread1();
		Thread thread1 = new Thread(myThread1, "work1");
		thread1.start();
		thread1.join();
		
		new Thread(myThread1, "work2").start();
		new Thread(myThread1, "work3").start();

	}

}
