package cts.thread;

public class ThreadExample1 extends Thread {

	@Override
	public void run() {

		for (int x = 0; x <= 20; x++)
			System.out.println(x + "  " + getName() + "  ");
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadExample1 t1 = new ThreadExample1();
		ThreadExample1 t2 = new ThreadExample1();
		ThreadExample1 t3 = new ThreadExample1();
		ThreadExample1 t4 = new ThreadExample1();

		t1.setName("task1");
		t2.setName("task2");
		t3.setName("task3");
		t4.setName("task4");

		t1.setPriority(1);
		t2.setPriority(1);
		t3.setPriority(1);
		t4.setPriority(10);
		
		t1.start();
		//t1.join();
		t2.start();
		t3.start();
		t4.start();
	}

}
