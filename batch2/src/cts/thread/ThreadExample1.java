package cts.thread;

public class ThreadExample1 extends Thread {
	int addition(int a, int b) {
		return a + b;
	}

	int subtraction(int a, int b) {
		return a - b;
	}

	@Override
	public void run() {
		System.out.println("additon is  " + addition(11, 3));
		System.out.println("subtraction is  " + subtraction(11, 3));
		  for(int x=1;x<=20;x++)
		System.out.println(x+" child thread " + getName());
	}

	public static void main(String[] args) {
		System.out.println("main thread running ");
		System.out.println(Thread.currentThread());
		System.out.println("main thread ends  ");
		Thread t1 = new ThreadExample1();
		t1.start();
		Thread t2 = new ThreadExample1();
		t2.start();
		Thread t3 = new ThreadExample1();
		t3.start();
	}
}
