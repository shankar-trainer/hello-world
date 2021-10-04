package com.capgemini.collection;
interface Account {
	void withdraw(int amt);
	void deposit(int amt);
}

public class AnonymousInnerClass {
	int balance;
	Account account = new Account() {
		@Override
		public void withdraw(int amt) {
			balance = balance - amt;
		}

		@Override
		public void deposit(int amt) {
			balance = balance + amt;
		}
	};

	public static void main(String[] args) {
		
		AnonymousInnerClass obj1 = new AnonymousInnerClass();
		obj1.balance = 7000;
		System.out.println("balance is " + obj1.balance);
		obj1.account.deposit(800);

		System.out.println("after deposit  balance is " + obj1.balance);
		obj1.account.withdraw(100);
		System.out.println("after deposit  balance is " + obj1.balance);
	}
}
