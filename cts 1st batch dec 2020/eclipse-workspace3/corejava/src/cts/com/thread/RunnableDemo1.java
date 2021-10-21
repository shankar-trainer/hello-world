package cts.com.thread;

public class RunnableDemo1  implements Runnable{

	void sum(int a, int b) {
	 System.out.println("\tsum is "+(a+b));	
	}
	void sub(int a, int b) {
		System.out.println("\tsubtraction  is "+(a-b));	
	}
	void mul(int a, int b) {
		System.out.println("\tmul is "+(a*b));	
	}
	void div(int a, int b) {
		System.out.println("\tdiv is "+(a/b));	
	}
	 
	Thread t;
	
	@Override
	public void run() {
	   t=Thread.currentThread();
	   for (int i = 0; i <15; i++) {
			System.out.println(t.getName());
			sum(10,8);
			sub(10,8);
			mul(10,8);
			div(200,8);
      	}
	}
	
	public static void main(String[] args) {
              RunnableDemo1 demo1=new RunnableDemo1();
              Thread t1=new Thread(demo1);
              Thread t2=new Thread(demo1);
              Thread t3=new Thread(demo1);
              Thread t4=new Thread(demo1);
             
              t1.start();
              t2.start();
              t3.start();
              t4.start();
	}
}
