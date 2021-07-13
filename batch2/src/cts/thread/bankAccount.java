package cts.thread;

public class bankAccount {
	int balance;

	public bankAccount(int balance) {
		this.balance = balance;
	}

	public synchronized void deposit(int amt) {
		this.balance = this.balance + amt;
	}

	public synchronized void withdraw(int amt) {
		this.balance = this.balance - amt;
	}

	public static void main(String[] args) {
		bankAccount account = new bankAccount(12000);

		Runnable runnable = () -> {
			System.out.println("\nbalance is " + account.balance);
			account.deposit(1000);
			System.out.println(" after deposit balance is " + account.balance);
			account.withdraw(500);
			System.out.println("after withdraw balance is " + account.balance);
		};

		new Thread(runnable).start();
		new Thread(runnable).start();
		new Thread(runnable).start();
	}
}