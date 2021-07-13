package cts.thread;

public class RunnablePrg1 implements Runnable {

	@Override
	public void run() {

		System.out.println("child thread " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		RunnablePrg1 prg1 = new RunnablePrg1();
		Thread thread1 = new Thread(prg1);
		Thread thread2 = new Thread(prg1);
		Thread thread3 = new Thread(prg1);
		Thread thread4 = new Thread(prg1);

		thread1.setName(" task1 ");
		thread2.setName(" task2 ");
		thread3.setName(" task3 ");
		thread4.setName(" task4 ");
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}

}
