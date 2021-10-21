package org.com.capegemini;

public class Factorial {
	int fact = 1;

	int factorial(int p) {
		for (int i = 1; i <= p; i++) {
			fact = fact * i;
		}
		return fact;
	}

	int factorial1(int p) {
		//int fact;
		
		for (int i = 1; i <= p; i++) {
			fact = fact * i;
		}
		return fact;
	}
	
	
	public static void main(String[] args) {
	
		Factorial factorial=new Factorial();
		int res=factorial.factorial(5);
		System.out.println("factorial is "+res);
		
		
	}
	
}
