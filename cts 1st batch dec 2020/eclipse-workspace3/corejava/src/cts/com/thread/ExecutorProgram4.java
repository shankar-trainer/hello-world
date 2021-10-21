package cts.com.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorProgram4 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		Runnable runnable1 = () -> {
			System.out.println("task1");
		};
		Runnable runnable2 = () -> {
			System.out.println("task2");
		};
		Runnable runnable3 = () -> {
			System.out.println("task3");
		};
		Runnable runnable4 = () -> {
			System.out.println("task4");
		};
		
		ExecutorService es=Executors.newFixedThreadPool(10);
		
		Future<?> submit1 = es.submit(runnable1);
		Future<?> submit2 = es.submit(runnable2);
		Future<?> submit3 = es.submit(runnable3);
		Future<?> submit4 = es.submit(runnable4);
		
		submit1.cancel(true);
		
		//es.shutdown();
		
		//System.out.println(submit1.get());
		System.out.println(submit2.get());
		System.out.println(submit3.get());
		System.out.println(submit4.get());
	}
}
