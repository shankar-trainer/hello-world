package cts.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorPrg1 {

	public static void main(String[] args) {

		Runnable r1 = () -> {
			System.out.println("child thread  " + Thread.currentThread().getName());
		};

		Runnable r2 = () -> {
			System.out.println("child thread  " + Thread.currentThread().getName());
		};

		Runnable r3 = () -> {
			System.out.println("child thread  " + Thread.currentThread().getName());
		};

		Runnable r4 = () -> {
			System.out.println("child thread  " + Thread.currentThread().getName());
		};

		Executor executor = Executors.newSingleThreadExecutor();
		executor.execute(r1);
		executor.execute(r2);

		// Executor executor1=Executors.newFixedThreadPool(10);
		ExecutorService executor1 = Executors.newFixedThreadPool(10);
		System.out.println("using executor service");
		executor1.execute(r1);
		executor1.execute(r2);
		executor1.execute(r3);
		executor1.execute(r4);

	}
}
