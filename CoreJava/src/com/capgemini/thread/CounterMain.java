package com.capgemini.thread;

class Counter {
	static int c = 1;
}

class MyCounter implements Runnable {

	@Override
	public void run() {
		for (int x = 0; x <= 2; x++) {
         increment();
		}
	}

synchronized	void increment() {
		System.out.print(Counter.c++);
		System.out.print("  ,");
	}
}

public class CounterMain{

	public static void main(String[] args) {
       MyCounter counter=new MyCounter();
        new Thread(counter).start();
        new Thread(counter).start();
        new Thread(counter).start();
	}
  
}
