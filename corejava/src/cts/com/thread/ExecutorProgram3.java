package cts.com.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorProgram3 {

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

		Executor executor = Executors.newFixedThreadPool(10);
		
		executor.execute(runnable1);
		executor.execute(runnable2);
		executor.execute(runnable3);
		executor.execute(runnable4);
		
		
//		ExecutorService es=Executors.newFixedThreadPool(10);
//		
//		Future<?> submit = es.submit(runnable1);
//		
//		System.out.println(submit.get());
		

	}
}
