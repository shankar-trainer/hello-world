package cts.com.thread;

public class MyThread {

	
	public static void main(String[] args) throws InterruptedException {
		
		Runnable runnable=()->{
			for(int x=0;x<=20;x++)
				System.out.println(x+" child thread "+Thread.currentThread().getName());
			
//			if(Thread.currentThread().getName().equals("process1")) 
//			{
//				try {
//					Thread.sleep(5000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//			System.out.println("after sleep ");
		};
		
		Thread thread1=new Thread(runnable);
		Thread thread2=new Thread(runnable);
		Thread thread3=new Thread(runnable);
		Thread thread4=new Thread(runnable);
		
		thread1.setName("process1");
		thread2.setName("process2");
		thread3.setName("process3");
		thread4.setName("process4");
		
		
		//thread4.setPriority(10);
		thread4.setPriority(Thread.MAX_PRIORITY);
		
		thread1.setPriority(1);
		thread2.setPriority(1);
		thread3.setPriority(1);
		
		
		thread1.start();
		
		//thread1.join();
		
		thread2.start();
		thread3.start();
		thread4.start();
		
		
		
	}
}
