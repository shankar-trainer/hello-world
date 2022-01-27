package com.montran.java8;

interface Bank {
	String name = "sbi";
	float rate = 6.4f;

	void withdraw(float amt);

	void deposit(float amt);

	default float interest(float amt, int time) {
		return amt * time * rate;
	}

	static void bankInfo() {
		System.out.println("interest rate  " + rate);
		System.out.println("name  " + name);
	}
}

class SavingBank implements Bank {
	private float balance;

	public float getBalance() {
		return balance;
	}

	public SavingBank(float balance) {
		super();
		this.balance = balance;
	}

	@Override
	public void withdraw(float amt) {
		balance = balance - amt;
	}

	@Override
	public void deposit(float amt) {
		balance = balance + amt;
	}
}

class CurrentBank implements Bank {
	private float balance;

	public float getBalance() {
		return balance;
	}

  
	public CurrentBank(float balance) {
		super();
		this.balance = balance;
	}

	@Override
	public void withdraw(float amt) {
		balance = balance - amt;
	}

	@Override
	public void deposit(float amt) {
		balance = balance + amt;
	}
}

public class Example1 {
	public static void main(String[] args) {
		Bank.bankInfo();
		Bank bank1 = new SavingBank(12000);
		SavingBank bank=new SavingBank(12000);
		
         System.out.println("Interest is "+  bank1.interest(12000,4));
         
         bank.deposit(4000);
         System.out.println("bank balance  after deposit is "+bank.getBalance());
         
	}
}
