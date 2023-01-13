package com.audintel.thread;

public class THreadPrg2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(i + "   " + Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
       THreadPrg2 prg2=new THreadPrg2();
       
       Thread thread1=new Thread(prg2);  
       Thread thread2=new Thread(prg2);  
       Thread thread3=new Thread(prg2); 
       
       thread1.start();
       thread2.start();
       thread3.start();
	}
}
