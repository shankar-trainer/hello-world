package com.capegemini.thread;

import java.util.Comparator;
import java.util.List;
import java.util.Set;

import com.capegemini.io.PasswordValidation;

public class RunnableDemo extends PasswordValidation implements Runnable {
	
	Thread  t;
 	@Override
	public void run() {
 		t=Thread.currentThread();
		System.out.println("child thread "+t.getName()+"  priority "
 		+t.getPriority());
	}

	public static void main(String[] args) {
		RunnableDemo runnableDemo = new RunnableDemo();

		Thread t1 = new Thread(runnableDemo);
		t1.start();
	}
}

/*
 * class Hello10 extends Thread implements Runnable, Comparable,
 * Comparator,Set,List {
 * 
 * }
 */
