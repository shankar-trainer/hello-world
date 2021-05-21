package com.cts.inner;

interface Operation{
	void withdraw(int a);
	void deposit(int a);
}

public class MyClass2 {

	int balance;
	
	public static void main(String[] args) {
		MyClass2 class2=new MyClass2();
		Operation operation=new Operation() {
			
			@Override
			public void withdraw(int a) {
			class2.balance=class2.balance-a;
			}
			
			@Override
			public void deposit(int a) {
				class2.balance=class2.balance+a;
			}
		};
		
		class2.balance=2000;
		System.out.println(class2.balance);
		operation.deposit(200);
		System.out.println("after deposit "+class2.balance);
	
		operation.withdraw(50);
		System.out.println("after withdraw "+class2.balance);
		
	}
}
