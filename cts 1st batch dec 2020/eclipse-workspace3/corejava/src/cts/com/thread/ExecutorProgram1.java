package cts.com.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExecutorProgram1  implements Runnable{

	@Override
	public void run() {
	
		for (int i = 0; i <=10; i++) {
			System.out.println(Thread.currentThread().getName()+"  "+i);
		}
	}
	
	public static void main(String[] args) {
		Executor executor=Executors.newSingleThreadExecutor();
		executor.execute(new ExecutorProgram1());
	}
}
