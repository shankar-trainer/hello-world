package thread;
public class ThreadDemo1 extends Thread {
	
	@Override
	public void run() {
		for(int x=1;x<=10;x++)
	  System.out.println(x+" Child Thread running "+getName());
	}

	public static void main(String[] args) {
		//ThreadDemo1 t1=new ThreadDemo1();
		Thread t1=new ThreadDemo1();
		t1.setName("task1");
		
		Thread t2=new ThreadDemo1();
		t2.setName("task2");
		
		Thread t3=new ThreadDemo1();
		t3.setName("task3");
	
		System.out.println("main thread running");
		t1.start();t2.start(); t3.start();
		
		//t1.run();t2.run();t3.run();
		
		System.out.println("Main thread ends");
	}
}
