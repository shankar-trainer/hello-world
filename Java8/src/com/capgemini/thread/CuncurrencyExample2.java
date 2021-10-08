package com.capgemini.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CuncurrencyExample2 {

	public static void main(String[] args) throws InterruptedException {

		Runnable r1 = () -> System.out.println("thread program1");
		Runnable r2 = () -> System.out.println("thread program2");
		Runnable r3 = () -> System.out.println("thread program3");
		Runnable r4 = () -> System.out.println("thread program4");

		 //Executor executor11=Executors.newSingleThreadExecutor();
		ExecutorService executor1 = Executors.newFixedThreadPool(10);

	
		
		Future<?> submit1 = executor1.submit(r1);
		Future<?> submit2 = executor1.submit(r2);
		Future<?> submit3 = executor1.submit(r3);
		Future<?> submit4 = executor1.submit(r4);

		//submit1.cancel(true);
		
		System.out.println(submit1.isCancelled()+"  ");
		try {
			System.out.println(submit2.isCancelled() +"  "+submit1.get());
			System.out.println(submit3.isCancelled() +"  "+submit2.get());
			System.out.println(submit4.isCancelled() +"  "+submit3.get());

		} catch (InterruptedException | ExecutionException e) {
			System.err.println(e);
		}
	}
}
