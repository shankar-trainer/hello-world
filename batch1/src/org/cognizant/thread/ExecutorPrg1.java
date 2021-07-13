package org.cognizant.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExecutorPrg1 {
	public static void main(String[] args) {

		Runnable r1 = () -> {
			System.out.println("child thread called "+Thread.currentThread().getName());
		};
		
		Runnable r2 = () -> {
			System.out.println("child thread called "+Thread.currentThread().getName());
		};

		Executor executor = Executors.newSingleThreadExecutor();
		executor.execute(r1);
		executor.execute(r2);
	}
}
