package com.cts.thread;

public class RunnablePrg5 {

	public RunnablePrg5(String name, Runnable r) {
		new Thread(r, name).start();
	}

	public static void main(String[] args) throws InterruptedException {
		Runnable r1 = () -> {
			for (int i = 1; i < 30; i++)
				System.out.println(i + "  " + Thread.currentThread().getName());
		};

		new RunnablePrg5("task1", r1);
		new RunnablePrg5("task2", r1);
		new RunnablePrg5("task3", r1);

	}
}
