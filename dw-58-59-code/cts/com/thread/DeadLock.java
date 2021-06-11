package cts.com.thread;

public class DeadLock {
	static String res1 = "book";
	static String res2 = "pen";

	public static void main(String[] args) {
		Thread1 thread1=new Thread1();
		Thread2 thread2=new Thread2();

		thread1.start();
		thread2.start();
	}
}

class Thread1 extends Thread {
	@Override
	public void run() {
		synchronized (DeadLock.res1) {
			System.out.println(getName() + " got  " + DeadLock.res1);
			synchronized (DeadLock.res2) {
				System.out.println(getName() + " wairing for   " + DeadLock.res2);

			}
		}
	}
}

class Thread2 extends Thread {
	@Override
	public void run() {
		synchronized (DeadLock.res2) {
			System.out.println(getName()+" got  "+DeadLock.res2);
			synchronized (DeadLock.res1) {
				System.out.println(getName()+" wairing for   "+DeadLock.res1);
   
			}
		}
	}
}
