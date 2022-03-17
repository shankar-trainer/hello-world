package com.capgemini.thread;

class Welcome{
	
	synchronized void display(String name) {
		for (int i = 0; i <=9; i++) {
			System.out.println("hello");
			System.out.println(name);
		}
	}
	
}

public class SynchronizationExample1 implements Runnable {
	Welcome welcome=new Welcome();
	
	@Override
	public void run() {
	  welcome.display("ram kumar");     	
	}
	
	public static void main(String[] args) {
		SynchronizationExample1 example1=new SynchronizationExample1();
	 
		Thread t1=new Thread(example1);
		Thread t2=new Thread(example1);
	
		t1.start();
		t2.start();
	}

}
