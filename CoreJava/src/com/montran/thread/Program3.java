package com.montran.thread;

import java.util.Random;

public class Program3 extends Thread {

	void addition(int a, int b) {
		System.out.printf("\nsum of %d and %d is %d ", a, b, a + b);
	}

	public Program3(String s) {
		setName(s);
		this.start();
	}

	@Override
	public void run() {
		System.out.println("run called ");
		int a = new Random().nextInt();
		int b = new Random().nextInt();

		for (int i = 1; i <= 20; i++) {
			System.out.print(i + "   " + getName());
			addition(a, b);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		//new Program3("process1").start();
		//new Program3("process2").start();
		//new Program3("process3").start();
		
		new Program3("process1");
		new Program3("process2");
		new Program3("process3");
		
	}

}
