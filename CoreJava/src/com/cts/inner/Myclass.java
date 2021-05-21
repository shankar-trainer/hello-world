package com.cts.inner;

interface Bank{
	void deposit(int amt);
	void withdraw(int amt);
}


public class Myclass{
int balance;
	Bank bank=new Bank() {
		
		@Override
		public void withdraw(int amt) {
		 balance=balance-amt;
		}
		
		@Override
		public void deposit(int amt) {
			balance=balance+amt;
		}
	};
	
	public static void main(String[] args) {
		Myclass myclass=new Myclass();
		myclass.balance=10000;
		myclass.bank.deposit(100);
		System.out.println(myclass.balance);
		myclass.bank.withdraw(10);
		System.out.println(myclass.balance);
		
	}
	
}
