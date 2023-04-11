package com.audintel.thread;

public class ThreadPrg1 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(getName());
			show1(i);
			display(i);
		}
	}

	void show1(int x) {
		System.out.println(x + " this is show method");
	}

	void display(int x) {
		System.out.println(x + " this is display method");
	}

	public static void main(String[] args) {

		ThreadPrg1 prg1 = new ThreadPrg1();
		ThreadPrg1 prg2 = new ThreadPrg1();
		ThreadPrg1 prg3 = new ThreadPrg1();
		
		prg1.setName("task1");
		prg2.setName("task2");
		prg3.setName("task3");
		
		prg1.start();
		prg2.start();
		prg3.start();
	}
}
