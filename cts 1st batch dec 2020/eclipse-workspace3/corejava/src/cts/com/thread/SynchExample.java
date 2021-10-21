package cts.com.thread;

public class SynchExample implements Runnable {

	static class Counter {
		static int count = 1;
	}

//synchronized
	void increment() {
		System.out.print("   " + Counter.count++);
	}

	@Override
	public void run() {

		increment();
		increment();
		increment();
	}

	public static void main(String[] args) {
		SynchExample synchExample1 = new SynchExample();
		new Thread(synchExample1).start();
		new Thread(synchExample1).start();
		new Thread(synchExample1).start();
	}

}
