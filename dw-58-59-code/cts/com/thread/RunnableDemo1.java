package cts.com.thread;

public class RunnableDemo1 {

	public static void main(String[] args) {
		Runnable runnable=new Runnable() {
			Thread t1=Thread.currentThread();
			@Override
			public void run() {
				for (int i = 0; i <=20; i++) {
					System.out.println(i+"  "+t1.getName());
				}
			}
		};
		
		Thread th1=new Thread(runnable);
		Thread th2=new Thread(runnable);
		Thread th3=new Thread(runnable);
	
		
		th1.start();
		th2.start();
		th3.start();
		
	}
}
