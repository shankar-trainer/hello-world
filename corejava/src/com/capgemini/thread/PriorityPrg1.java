package com.capgemini.thread;

public class PriorityPrg1  implements Runnable{

	@Override
	public void run() {
		
		for(int x=1;x<=30;x++) {
			System.out.println(x+"  "+Thread.currentThread().getName()+"  ");
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		PriorityPrg1 prg1=new PriorityPrg1();
		Thread t1=new Thread(prg1);
		Thread t2=new Thread(prg1);
		Thread t3=new Thread(prg1);
		Thread t4=new Thread(prg1);
		
		/*t4.setPriority(10);
		t1.setPriority(1);
		t2.setPriority(1);
		t3.setPriority(1);
		*/
		
		t1.start();
	     t1.join();// allow t1 to execute all steps and allow other threads to join after its end
		
		t2.start();
		t3.start();
		t4.start();
	}

}
