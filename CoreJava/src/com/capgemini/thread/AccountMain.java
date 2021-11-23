package com.capgemini.thread;

class MoneyTransfer1 implements Runnable {

	@Override
	public void run() {
		synchronized (Account.res1) {
			Account.deposit(1000);
			{
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (Account.res2) {
					System.out.println("transfer1 waiting for withdraw");
					Account.withdraw(600);
				}
			}
		}
	}
}

class MoneyTransfer2 implements Runnable {

	@Override
	public void run() {
		synchronized (Account.res2) {
			Account.withdraw(2000);
			{
				System.out.println(Thread.currentThread().getName());
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (Account.res1) {
					System.out.println("waiting for deposit");
					Account.deposit(800);
				}
			}
		}
	}
}

public class AccountMain {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MoneyTransfer1());
		Thread t2 = new Thread(new MoneyTransfer2());
		t1.start();
		t2.start();
	}

}
