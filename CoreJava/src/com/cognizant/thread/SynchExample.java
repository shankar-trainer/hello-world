package com.cognizant.thread;


class Account{
	static int x=0;
}

public class SynchExample  implements Runnable {

	@Override
	public void run() {
	  increment();
	  increment();
	  increment();
	}
 
    synchronized void increment() {
    	 System.out.print("  "+Account.x++);

     }
	public static void main(String[] args) {
      
		SynchExample example=new SynchExample();
        
		Thread t1=new Thread(example);
		Thread t2=new Thread(example);
		Thread t3=new Thread(example);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
