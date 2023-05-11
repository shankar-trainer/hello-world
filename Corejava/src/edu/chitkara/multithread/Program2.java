package edu.chitkara.multithread;

public class Program2 extends Thread {
	int ar[]= {1,2,3,4,5,6,7,8};
	@Override
	public void run() {
		for (int x = 0; x <=7; x++)
			System.out.println(x + "child thread  " + getName()+" "+ar[x]);
	}

	public static void main(String[] args) {
		System.out.println("main thread starts ");
		System.out.println(Thread.currentThread().getName());
		Thread thread1 = new Program2();
		Thread thread2 = new Program2();
		Thread thread3 = new Program2();
		thread1.start();
		thread2.start();
		thread3.start();

		System.out.println("main thread ends  ");
	}

}
