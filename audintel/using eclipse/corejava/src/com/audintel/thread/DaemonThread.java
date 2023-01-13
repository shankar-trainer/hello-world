package com.audintel.thread;

public class DaemonThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i <= 20; i++) {
			System.out.println(i + "  " + getName());
		}
	}

	public static void main(String[] args) {
      System.out.println("main thread running ");

      Thread t1=new DaemonThread();
      Thread t2=new DaemonThread();
     t1.setDaemon(true);
     t2.setDaemon(true);
      
      t1.start();
      t2.start();
      
      System.out.println("main thread exits ");
	}
}
