package cts.com.thread;

public class ThreadPrg1  extends Thread{

	@Override
	public void run() {
		for (int i = 0; i <=20; i++) 
	  System.out.println("child thread "+getName());
	}
	
	public static void main(String[] args) {
		
		System.out.println("main thread starts ");
		
		Thread thread1=new ThreadPrg1();
		ThreadPrg1 thread2=new ThreadPrg1();
		ThreadPrg1 thread3=new ThreadPrg1();
		thread1.setName("process1");
		thread2.setName("process2");
		thread3.setName("process3");
		
		thread1.start();
		thread2.start();
		thread3.start();

		System.out.println("main thread ends");
	}
}
