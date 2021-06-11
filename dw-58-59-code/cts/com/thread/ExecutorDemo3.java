package cts.com.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExecutorDemo3 {

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

		Executor executor = Executors.newFixedThreadPool(5);
		executor.execute(runn1);
		executor.execute(runn2);
		executor.execute(runn3);
		executor.execute(runn4);
		executor.execute(runn5);
	}
}
