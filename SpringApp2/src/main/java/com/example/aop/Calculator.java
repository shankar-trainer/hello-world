package com.example.aop;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

	public int addition(int a, int b) {
		System.out.println("addition of "+a+"  and "+b+" is "+(a+b));
		return a+b;
	}
	public int subtraction(int a, int b) {
		System.out.println(" subtraction of "+a+"  and "+b+" is "+(a-b));
		return a-b;
	}
	
	public int multiplication(int a, int b) {
		System.out.println("multiplication of "+a+"  and "+b+" is "+(a*b));
		return a*b;
	}
	public int division(int a, int b) {
		if(b==0)
			throw new IllegalArgumentException("division by zero error");
		
		System.out.printf("\ndivision of %d and %d is %d",a,b,(a/b));
		return a/b;
	}
	
}
