package cts.com.thread;

public class Account {
	static int balance = 0;
}

class MyClass {
	synchronized void increment() {
		Account.balance = Account.balance + 1;
		System.out.print(Account.balance + "  , ");
	}

	public static void main(String[] args) {
		MyClass class1 = new MyClass();
		Runnable runnable = () -> {
			class1.increment();
			class1.increment();
			class1.increment();
		};

		Thread t1 = new Thread(runnable);
		t1.start();

		Thread t2 = new Thread(runnable);
		t2.start();

		Thread t3 = new Thread(runnable);
		t3.start();
	}
}