package cts.com.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExecutorDemo2  {

	public static void main(String[] args) {
		Runnable  runn1=()->{
			for (int i = 0; i <= 10; i++) {
				System.out.println(i + " " + Thread.currentThread().getName());
			}
		};
		
		Runnable  runn2=()->{
			for (int i = 0; i <= 10; i++) {
				System.out.println(i + " " + Thread.currentThread().getName());
			}
		};
		
		
		Executor executor=Executors.newSingleThreadExecutor();
		executor.execute(runn1);
		executor.execute(runn2);
	}
}
