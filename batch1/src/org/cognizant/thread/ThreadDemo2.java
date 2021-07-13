package org.cognizant.thread;

public class ThreadDemo2  extends Thread{

	@Override
	public void run() {
		for(int x=1;x<=20;x++)
		System.out.println(x+"  child thread "+getName());
	}
	
	public static void main(String[] args) {
	    System.out.println("main thread starts ");
		Thread t1=new ThreadDemo2();
		Thread t2=new ThreadDemo2();
		Thread t3=new ThreadDemo2();
		t1.start();
		t2.start();
		t3.start();
		System.out.println("main thread ends  ");
	}
}
