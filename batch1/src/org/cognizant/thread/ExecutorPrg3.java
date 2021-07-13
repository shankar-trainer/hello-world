package org.cognizant.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorPrg3 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
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
		
		ExecutorService executor=Executors.newFixedThreadPool(4);
		
		
		Future<?> future1=executor.submit(r1);
		Future<?> future2=executor.submit(r2);
		Future<?> future3=executor.submit(r3);
		Future<?> future4=executor.submit(r4);
		
		future2.cancel(true);
		
		System.out.println(future1.get());
		//System.out.println(future2.get());
		System.out.println(future3.get());
		System.out.println(future4.get());
		
	}
}
