package cts.com.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorDemo4 {

	public static void main(String[] args) {
		Runnable runn1 = () -> {
			System.out.println("task1");
		};

		Runnable runn2 = () -> {
			System.out.println("task2");
		};
		Runnable runn3 = () -> {
			System.out.println("task3");
		};
		Runnable runn4 = () -> {
			System.out.println("task4");
		};
		Runnable runn5 = () -> {
			System.out.println("task5");
		};

		ExecutorService es = Executors.newFixedThreadPool(5);
		Future<?> submit1 = es.submit(runn1);
		Future<?> submit2 = es.submit(runn2);
		Future<?> submit3 = es.submit(runn3);
		Future<?> submit4 = es.submit(runn4);
		Future<?> submit5 = es.submit(runn5);

		submit1.cancel(true);
	try {
		//System.out.println(submit1.get());
		System.out.println(submit2.get());
		System.out.println(submit3.get());
		System.out.println(submit4.get());
		System.out.println(submit5.get());
	
	} catch (InterruptedException | ExecutionException e) {
		e.printStackTrace();
	}
		
		
	}
}
