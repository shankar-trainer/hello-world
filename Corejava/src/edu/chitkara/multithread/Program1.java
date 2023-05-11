package edu.chitkara.multithread;

public class Program1 extends Thread {
	@Override
	public void run() {
	   for(int x=1;x<=20;x++)
	System.out.println(x+"child thread  "+getName());
	}
	public static void main(String[] args) {
		System.out.println("main thread starts ");
		System.out.println   
		      (Thread.currentThread().getName());
		Thread thread1=new Program1();
	    Thread thread2=new Program1();
	    Thread thread3=new Program1();
	     thread1.start();
	     thread2.start();
	     thread3.start();
		
		System.out.println("main thread ends  ");
	}
	
}
