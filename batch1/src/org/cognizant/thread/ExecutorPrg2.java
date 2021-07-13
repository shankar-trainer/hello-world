package org.cognizant.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExecutorPrg2 {

	public static void main(String[] args) {
		Runnable r1 = () -> {
			System.out.println(Thread.currentThread().getName());
		};
		
		Runnable r2 = () -> {
			System.out.println(Thread.currentThread().getName());
		};
		
		Runnable r3 = () -> {
			System.out.println(Thread.currentThread().getName());
		};
		
		Runnable r4 = () -> {
			System.out.println(Thread.currentThread().getName());
		};
		
		Executor executor=Executors.newFixedThreadPool(4);
		executor.execute(r1);
		executor.execute(r2);
		executor.execute(r3);
		executor.execute(r4);

	}
}
