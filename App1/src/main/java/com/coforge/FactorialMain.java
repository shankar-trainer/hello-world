package com.coforge;

public class FactorialMain {

	public static void main(String[] args) {
		int f=5;
		System.out.println("factorial of "+f+" is "+new Factorial().myfactorial(f));
		System.out.printf("\nfactorial of  %d is  %d  ",f,new Factorial().myfactorial(f));
	}
}
