package com.audintel.thread;

public class BankAccount implements Runnable {

	float balance=4000;

	public void withdraw(float amt) {
		balance = balance - amt;
	}

	@Override
	public void run() {
	    makeWithdraw(5000);
	    makeWithdraw(2000);
	    makeWithdraw(3000);
	    makeWithdraw(4000);
	}
	
 synchronized	void makeWithdraw(int amt) {
	        if(balance<amt)
	        	System.out.println("cannot withdraw balance is "+balance);
	        else { 
	        	withdraw(amt);
	           System.out.println("after withdraw the balance is "+balance);
	        }
	}

}
