package com.capgemini.thread;

class BankAccount {
	private float balance;

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public synchronized void deposit(float amt) {
		balance = balance + amt;
	}

	public synchronized void withdraw(float amt) {
		balance = balance - amt;
	}
}

public class BankAccountMain implements Runnable {
	BankAccount account=new BankAccount();
	
	@Override
	public void run() {
     account.setBalance(10000);
     System.out.println("\nbalance is "+account.getBalance());
     account.deposit(5000);
     System.out.println("after deposit balance is "+account.getBalance());
     account.withdraw(1000);
     System.out.println("after withdraw balance is "+account.getBalance());
	}

	public static void main(String[] args) {
		BankAccountMain main=new BankAccountMain();
	    Thread t1=new Thread(main);	
	    Thread t2=new Thread(main);	
	    Thread t3=new Thread(main);	
	    
	    t1.start();
	    t2.start();
	    t3.start();
	}
}
