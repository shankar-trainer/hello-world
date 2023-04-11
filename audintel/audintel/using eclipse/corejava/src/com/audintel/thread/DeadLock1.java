package com.audintel.thread;

public class DeadLock1  implements Runnable{

	static Object res1="printer";
	static Object res2="keyboard";
	
	@Override
	public void run() {
		
                      synchronized (DeadLock1.res1) {
                  		  System.out.println(Thread.currentThread().getName()+" is holding lock over "+DeadLock1.res1);
                          synchronized (DeadLock1.res2) {
                        	  System.out.println(Thread.currentThread().getName()+" waiting  lock for  "+DeadLock1.res2);
    					}		
					}		
	}
}

class DeadLock2  implements Runnable{
	
	@Override
	public void run() {
		
                      synchronized (DeadLock1.res2) {
                  		  System.out.println(Thread.currentThread().getName()+" is holding lock over "+DeadLock1.res2);
                          synchronized (DeadLock1.res1) {
                        	  System.out.println(Thread.currentThread().getName()+" waiting  lock for  "+DeadLock1.res1);
    					}		
					}		
	}
}
