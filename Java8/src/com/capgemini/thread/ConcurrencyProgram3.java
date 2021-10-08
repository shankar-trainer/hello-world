package com.capgemini.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrencyProgram3 {

	public static void main(String[] args) {
		Runnable r1 = () -> System.out.println(Thread.currentThread().getName() + "  thread program1");
		Runnable r2 = () -> System.out.println(Thread.currentThread().getName() + "  thread program2");
		Runnable r3 = () -> System.out.println(Thread.currentThread().getName() + "  thread program3");
		Runnable r4 = () -> System.out.println(Thread.currentThread().getName() + "  thread program4");

		Executor executor1 = Executors.newSingleThreadExecutor();
		System.out.println("newSingleThreadExecutor");

		executor1.execute(r1);
		executor1.execute(r2);
		executor1.execute(r3);
		executor1.execute(r4);
		/*
		 * pool-1-thread-1 thread program1 pool-1-thread-1 thread program2
		 * pool-1-thread-1 thread program3 pool-1-thread-1 thread program4
		 */

		ExecutorService executor11 = Executors.newFixedThreadPool(10);

		System.out.println("newFixedThreadPool");
		executor11.execute(r1);
		executor11.execute(r2);
		executor11.execute(r3);
		executor11.execute(r4);

	}
}
