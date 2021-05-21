package com.cts.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicEx {

	AtomicInteger p = new AtomicInteger(1);

	public void increment() {
		p.incrementAndGet();
	}

	public int val() {
		return p.get();
	}

	public static void main(String[] args) {
       AtomicEx ex=new AtomicEx();
       
		Runnable runnable=()->{
		      for(int x=1;x<=10;x++) {
		    	  ex.increment();
		    	  System.out.print(ex.val()+"  ");
		      }	
		};
		
		new Thread(runnable).start();
	}
}
