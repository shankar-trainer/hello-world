package cts.com.thread;

public class ThreadDemo1 extends Thread {

	@Override
	public void run() {
		for (int x = 1; x <= 20; x++)
			System.out.println(x + "   " + getName() + "  child thread ");
	}

	public static void main(String[] args) {

		Thread t1 = new ThreadDemo1();
		ThreadDemo1 t2 = new ThreadDemo1();
		ThreadDemo1 t3 = new ThreadDemo1();

		t1.setName("task1");
		t2.setName("task2");
		t3.setName("task3");

		t1.start();
		t2.start();
		t3.start();

		System.out.println("start ");
		System.out.println(Thread.currentThread());

		System.out.println("stop ");
	}
}
