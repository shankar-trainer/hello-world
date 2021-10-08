package com.capgemini.thread;

public class ThreadbyLambda  {

	public static void main(String[] args) {
	
		Runnable runnable2=()->{
			System.out.println("child thread is running1 ");
		};
		
		
		System.out.println("Main thread running");
		
		new Thread(runnable2).start();
		
		new Thread(()->{
			System.out.println("child thread is running2 ");
		}).start();
		
		System.out.println("Main thread ends ");
		
	}
}
