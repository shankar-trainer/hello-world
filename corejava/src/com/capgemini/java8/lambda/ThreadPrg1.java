package com.capgemini.java8.lambda;

/*
public class ThreadPrg1  implements  Runnable{
@Override
public void run() {
	// TODO Auto-generated method stub
	
    }
}
*/

public class ThreadPrg1 {

	public static void main(String[] args) {
		System.out.println("main thread starts");
		Runnable runnable = () -> {
			System.out.println("child thread");
		};

		Thread t1 = new Thread(runnable);

		t1.start();
		System.out.println("main thread ends");
	}
}
