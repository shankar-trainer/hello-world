package cts.com.thread;

public class RunnableDemo implements Runnable {

	Thread t;

	@Override
	public void run() {
		t = Thread.currentThread();

		for (int i = 0; i <= 20; i++) {
//			if(t.getName().equals("Thread-1"))
//				try {
//					Thread.sleep(500);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
			System.out.println("\n thread sleep state \n");
			
			System.out.println(i + "   " + t.getName() + "  ");
			
		}
	}
	
	public static void main(String[] args) {
		System.out.println("main thread starts ");
		RunnableDemo demo=new RunnableDemo();
		
		Thread t1=new Thread(demo);
		Thread t2=new Thread(demo);
		Thread t3=new Thread(demo);
		t1.setName("task1");
		t2.setName("task2");
		t3.setName("task3");
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("main thread ends  ");
	}

}
