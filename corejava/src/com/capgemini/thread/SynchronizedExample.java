package com.capgemini.thread;

class Account {
	static int x=0;
}

public class SynchronizedExample  implements Runnable{

	synchronized void increment() {
		System.out.print( Account.x+",");
		Account.x++;
	 }

	@Override
	public void run() {
      //for(int x=0;x<=2;x++)
      {
    	  increment();
    	  increment();
    	  increment();
      }
	}
	 
	public static void main(String[] args) {
     SynchronizedExample example=new SynchronizedExample();
     Thread t1=new Thread(example);
     Thread t2=new Thread(example);
     Thread t3=new Thread(example);
     Thread t4=new Thread(example);
     
     t1.start();
     t2.start();
     t3.start();
     t4.start();
 	}
	 
}
