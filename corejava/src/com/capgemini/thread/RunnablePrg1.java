package com.capgemini.thread;

import javax.swing.JFrame;

//public class RunnablePrg1  extends JFrame , Thread

public class RunnablePrg1  extends JFrame  implements  Runnable 
{

	@Override
	public void run() {
		for(int x=1;x<=30;x++)
		System.out.println("child thread running "+Thread.currentThread().getName());	
	}

	public static void main(String[] args) {
		System.out.println("main thread running");
		RunnablePrg1 prg1=new RunnablePrg1();
		
		//Thread t1=new Thread(prg1);
		Thread t1=new Thread(prg1,"process1");
		
		Thread t2=new Thread(prg1);
		Thread t3=new Thread(prg1);
		
		t1.start();
		//t1.start();// thread is already started  , throw IllegalStateException
		t2.start();
		t3.start();
		
		System.out.println("main thread running");
		
	}
}
