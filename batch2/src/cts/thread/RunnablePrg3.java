package cts.thread;

public class RunnablePrg3 {

	public static void main(String[] args) {
		
		Runnable r1 = () -> {
			for (int i = 0; i < 23; i++) 
				System.out.println(i + "  " + Thread.currentThread().getName());
		};

		Thread t1 = new Thread(r1);
		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

		Thread t2 = new Thread(r1);
		t2.start();

		Thread t3 = new Thread(r1);
		t3.start();

	}
}
