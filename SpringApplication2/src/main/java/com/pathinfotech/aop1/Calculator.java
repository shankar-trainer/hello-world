package com.pathinfotech.aop1;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

	public double add(double a, double b) {
		System.out.println("sum of "+a+" and "+b+" is "+(a+b));
		return a+b;
	}
	
	public double subtraction(double a, double b) {
		System.out.println("subtraction of "+a+" and "+b+" is "+(a-b));
		return a-b;
	}
	
	public double multiplication(double a, double b) {
		System.out.println("multiplication of "+a+" and "+b+" is "+(a*b));
		return a*b;
	}
	
	public double division(double a, double b) {
		System.out.println("division of "+a+" and "+b+" is "+(a/b));
		return a/b;
	}
	
}
