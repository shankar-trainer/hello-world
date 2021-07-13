package com.cts.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

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

		// new Thread(r1).start();
		System.out.println("single thread example");
		Executor executor = Executors.newSingleThreadExecutor();
		executor.execute(r1);

		ExecutorService executorService = Executors.newFixedThreadPool(10);
		// executorService.execute(r1);
		// executorService.execute(r2);
		// executorService.execute(r3);

		Future<?> future1 = executorService.submit(r1);
		Future<?> future2 = executorService.submit(r2);
		Future<?> future3 = executorService.submit(r3);

		// future1.cancel(true);
		executorService.shutdown();
		try {
			System.out.println(future1.get());
			System.out.println(future2.get());
			System.out.println(future3.get());

		} catch (InterruptedException | ExecutionException e) {
			System.err.println(e.getMessage());
		}
	}
}
