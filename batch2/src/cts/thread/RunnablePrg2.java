package cts.thread;

public class RunnablePrg2 {

	public static void main(String[] args) {
		/*
		 * Runnable r1 = new Runnable() {
		 * 
		 * @Override public void run() { for (int i = 0; i < 23; i++) {
		 * System.out.println(i + "  " + Thread.currentThread().getName()); } } };
		 */

		Runnable r1 = () -> {
			for (int i = 0; i < 23; i++) {
				System.out.println(i + "  " + Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
					if (Thread.currentThread().getName().equals("Thread-0")) {
						Thread.currentThread().interrupt();
						System.out.println("Interrupted " + Thread.currentThread().isInterrupted());
					}
				} catch (InterruptedException e) {
					
				}
			}
		};

		Thread t1 = new Thread(r1);
		t1.start();

		Thread t2 = new Thread(r1);
		t2.start();

		Thread t3 = new Thread(r1);
		t3.start();

	}
}
