package com.capgemini.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class CuncurrencyExample {

	public static void main(String[] args) {

		Runnable r1 = () -> System.out.println("thread program1");
		Runnable r2 = () -> System.out.println("thread program2");
		Runnable r3 = () -> System.out.println("thread program3");
		Runnable r4 = () -> System.out.println("thread program4");

//		Thread t1 = new Thread(r1);
//		t1.start();
		
		Executor executor1=Executors.newSingleThreadExecutor();
		
		executor1.execute(r1);
		executor1.execute(r2);
		executor1.execute(r3);
		executor1.execute(r4);
		

	}
}
