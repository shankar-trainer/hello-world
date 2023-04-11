package com.audintel.thread;

public class BankAccountApp {

	public static void main(String[] args) {
	      BankAccount account=new BankAccount();
	      Thread t1=new Thread(account);
	      Thread t2=new Thread(account);
	      Thread t3=new Thread(account);
	      
	      t1.start();
	      t2.start();
	      t3.start();
	      
	}
}
