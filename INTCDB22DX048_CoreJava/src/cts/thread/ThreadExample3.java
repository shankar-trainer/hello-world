package cts.thread;

public class ThreadExample3 implements Runnable {

	Thread t1;

	@Override
	public void run() {
		t1 = Thread.currentThread();
		for (int i = 0; i <= 20; i++) {
			System.out.println(i + "\t" + t1.getId() + "\t" + t1.getName()+"\t"+t1.getPriority());
		}

	}

	public static void main(String[] args) {
		ThreadExample3 example2 = new ThreadExample3();
		Thread t1 = new Thread(example2);
		Thread t2 = new Thread(example2);
		Thread t3 = new Thread(example2);
		Thread t4 = new Thread(example2);
		
		t3.setPriority(10);
		t1.setPriority(1);
		t2.setPriority(1);
		t4.setPriority(1);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
