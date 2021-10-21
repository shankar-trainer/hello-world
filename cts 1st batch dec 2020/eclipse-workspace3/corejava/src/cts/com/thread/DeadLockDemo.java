package cts.com.thread;

class Resource {
	static String res1 = "printer";
	static String res2 = "keyboard";
}

class Thread1 extends Thread {

	@Override
	public void run() {

		synchronized (Resource.res1) {
			System.out.println("Thread1 got lock over " + Resource.res1);
			
			synchronized (Resource.res2) {
				System.out.println("Thread1  waiting lock for  " + Resource.res2);
			}
		}
	}
}

class Thread2 extends Thread {

	@Override
	public void run() {
		synchronized (Resource.res2) {
			System.out.println("Thread2 got lock over " + Resource.res2);

			synchronized (Resource.res1) {
				System.out.println("Thread2 waiting for  " + Resource.res1);
			}
		}
	}

}

public class DeadLockDemo {

	public static void main(String[] args) {
	new Thread1().start();
	new Thread2().start();
	
	}
}
