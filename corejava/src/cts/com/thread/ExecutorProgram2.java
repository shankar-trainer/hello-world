package cts.com.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExecutorProgram2 {

	public static void main(String[] args) {
		Runnable runnable1 = () -> {
			for (int i = 0; i <= 10; i++) {
				System.out.println("task1 " + i);
			}
		};

		Runnable runnable2 = () -> {
			System.out.println("task2");
		};

		Executor executor = Executors.newSingleThreadExecutor();
		executor.execute(runnable1);
		executor.execute(runnable2);

	}
}
