package com.cts.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorDemo2 {

	public static void main(String[] args) {
		Runnable task1 = () -> {
			System.out.println(Thread.currentThread().getName() + "  child thread is running ");
		};
		Runnable task2 = () -> {
			System.out.println(Thread.currentThread().getName() + "  child thread is running ");
		};
		Runnable task3 = () -> {
			System.out.println(Thread.currentThread().getName() + "  child thread is running ");
		};

//		ExecutorService service = Executors.newSingleThreadExecutor();
		ExecutorService service = Executors.newFixedThreadPool(10);

		//service.execute(task1);
		//service.execute(task2);
		//service.execute(task3);

		
		Future<?> submit1 = service.submit(task1);
		Future<?> submit2 =service.submit(task2);
		Future<?> submit3 =	service.submit(task3);
		
		submit1.cancel(true);
		System.out.println(submit1.isCancelled());
		System.out.println(submit2.isCancelled());
		System.out.println(submit3.isCancelled());
		
		/*Executors.newSingleThreadExecutor();
pool-1-thread-1  child thread is running 
pool-1-thread-1  child thread is running 
pool-1-thread-1  child thread is running 

Executors.newFixedThreadPool(10);

pool-1-thread-2  child thread is running 
pool-1-thread-3  child thread is running 
pool-1-thread-1  child thread is running 


		 * 
		 */

		
		
	}
}
