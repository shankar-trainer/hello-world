package com.cts.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableThread2  {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Callable<String> callable1=()->   "task1 executing";
		Callable<String> callable2=()->   "task2 executing";
		Callable<String> callable3=()->   "task3 executing";
		Callable<String> callable4=()->   "task4 executing";
		
		ExecutorService service=Executors.newScheduledThreadPool(10);
		
		Future<String> submit1 = service.submit(callable1);
		Future<String> submit2 =service.submit(callable2);
		Future<String> submit3 =service.submit(callable3);
		Future<String> submit4 =service.submit(callable4);
		
		System.out.println(submit1.get());
		System.out.println(submit2.get());
		System.out.println(submit3.get());
		System.out.println(submit4.get());
	}
}
