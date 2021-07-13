package cts.thread;

class Account {
	static int counter = 1;
}

public class AccountMain {
	synchronized void increment() {
		System.out.print(Account.counter++ + ", ");
	}

	public static void main(String[] args) {
		AccountMain accountMain = new AccountMain();
		Runnable runnable = () -> {
			accountMain.increment();
			accountMain.increment();
			accountMain.increment();
		};

		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		Thread t3 = new Thread(runnable);
		t1.start();
		t2.start();
		t3.start();
	}
}
