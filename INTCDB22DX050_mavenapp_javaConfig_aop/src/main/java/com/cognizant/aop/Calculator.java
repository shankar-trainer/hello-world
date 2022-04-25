package com.cognizant.aop;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

	public int addition(int a, int b) {
		System.out.println("sum of "+a+"and "+b+" is "+(a+b));
		return a+b;
	}

	public int subtraction(int a, int b) {
		System.out.println("subtraction of "+a+" and "+b+" is "+(a-b));
		return a-b;
	}
	public int multiplication(int a, int b) {
		System.out.println("multiplication  of "+a+"  and "+b+" is "+(a*b));
		return a*b;
	}
	public int division(int a, int b) {
		if(b==0)
			throw new IllegalArgumentException("divided by zero error ");
		
		System.out.println("divsion of "+a+" and "+b+" is "+(a/b));
		return a/b;
	}
	
}
