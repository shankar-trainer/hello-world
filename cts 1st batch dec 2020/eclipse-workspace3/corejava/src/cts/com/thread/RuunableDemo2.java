package cts.com.thread;

public class RuunableDemo2 {

	public static void main(String[] args) {
		
//		Runnable runnable=new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("runnable1 child program");
//			}
//		};
//		
//		Thread t1=new Thread(runnable);

		Thread t2= new Thread(()->{System.out.println("runnable2 child ");});
		
		t2.start();
	}
}
