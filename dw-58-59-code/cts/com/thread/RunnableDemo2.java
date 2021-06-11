package cts.com.thread;

public class RunnableDemo2 {

	public static void main(String[] args) {
	
		Runnable runnable=()->{
		  for (int i = 0; i <=20; i++) {
			System.out.println
	(i+"  "+Thread.currentThread().getName()+"  priority  "+Thread.currentThread().getPriority());
		}	
		};
		
		Thread th1=new Thread(runnable);
		Thread th2=new Thread(runnable);
		Thread th3=new Thread(runnable);
		
//		th1.setPriority(1);
		th1.setPriority(Thread.MIN_PRIORITY);
		//th3.setPriority(10);
		th3.setPriority(Thread.MAX_PRIORITY);
		
		
		th1.start();
		th2.start();
		th3.start();
		
	}
}
