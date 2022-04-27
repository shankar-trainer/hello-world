package com.cts.model;

public class Factorial {

	public int getFactorial(int a) {
		int fact=1;
		for(int x=1;x<=a;x++)
			fact=fact*x;
		
		System.out.println("factorial of "+a+" is "+fact);
		return fact;
	}
	
}
