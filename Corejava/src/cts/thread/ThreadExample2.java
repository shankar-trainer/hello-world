package cts.thread;

public class ThreadExample2 implements Runnable {

	Thread t1;

	@Override
	public void run() {
		t1 = Thread.currentThread();
		for (int i = 0; i <= 20; i++) {
			try {
				System.out.println(i + "\t" + t1.getId() + "\t" + t1.getName());
				if(t1.getName().equals("Thread-0") && i==4)
				Thread.sleep(500);
			  System.out.println(t1.getName()+" is sleeping ");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		ThreadExample2 example2 = new ThreadExample2();
		Thread t1 = new Thread(example2);
		Thread t2 = new Thread(example2);
		Thread t3 = new Thread(example2);
		Thread t4 = new Thread(example2);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
