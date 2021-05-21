package com.cts.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"  child thread is running ");
	}

	public static void main(String[] args) {
        ExecutorDemo demo=new ExecutorDemo();
        
		//Thread t1=new Thread(demo);
		//t1.start();
		
        ExecutorService service=Executors.newSingleThreadExecutor();
        
        service.execute(demo);
        
		
	}
}
