package cts.thread;

public class RunnablePrg4 {

	public static void main(String[] args) {
		
		Runnable r1 = () -> {
			for (int i = 0; i < 23; i++) 
				System.out.println(i + "  " + Thread.currentThread().getName()+"  "
			+ Thread.currentThread().getPriority());
		};

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		Thread t3 = new Thread(r1);
		
		//t3.setPriority(10);
		t3.setPriority(Thread.MAX_PRIORITY);
		

		t1.start();
		t2.start();
		t3.start();
	}
}
