package com.montran.thread;

class BankAccount {
	private float balance;

	public float getBalance() {
		return balance;
	}

	public BankAccount(float balance) {
		this.balance = balance;
	}

	public synchronized void deposit(float amt) {
		this.balance = this.balance + amt;
	}

	public synchronized void withdraw(float amt) {
		this.balance = this.balance - amt;
	}
}

public class bankAccountmain {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(20000);
		System.out.println("balance is " + account.getBalance());

		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					account.deposit(1000);
					//System.out.println((i+1)+"  user  "+Thread.currentThread().getName()+"after deposit  balance is "+account.getBalance());
				}
				System.out.println("  user  "+Thread.currentThread().getName()+"after deposit  balance is "+account.getBalance());
				for (int i = 0; i < 5; i++) {
					account.withdraw(1000);
				//	System.out.println((i+1)+" user "+Thread.currentThread().getName()+"after withdraw balance is "+account.getBalance());
				}
				System.out.println(" user "+Thread.currentThread().getName()+"after withdraw balance is "+account.getBalance());
			}
		};
		
		new Thread(runnable).start();
		//System.out.println("balance is " + account.getBalance());
		new Thread(runnable).start();
		//System.out.println("balance is " + account.getBalance());
	}

}
