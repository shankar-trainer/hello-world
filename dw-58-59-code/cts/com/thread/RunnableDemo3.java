package cts.com.thread;

public class RunnableDemo3 {

	public static void main(String[] args) throws InterruptedException {
	
		Runnable runnable=()->{
		  for (int i = 0; i <=20; i++) {
			System.out.println
	(i+"  "+Thread.currentThread().getName()+"  priority  "+Thread.currentThread().getPriority());
		}	
		};
		
		Thread th1=new Thread(runnable);
		Thread th2=new Thread(runnable);
		Thread th3=new Thread(runnable);
		
		th1.setName("process1");
		th2.setName("process2");
		th3.setName("process3");
		
		th1.start();
		th1.join();
		
		th2.start();
		th3.start();
		
	}
}
