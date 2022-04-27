package com.cognizant.aop1;

import org.springframework.stereotype.Component;

@Component
//("calc1")
public class ArithmaticCalculatorImpl implements ArithmaticCalculator {

	public double add(double a, double b) {

		System.out.printf("Addition of %f and %f is %f", a, b, (a + b));
		return a + b;
	}

	public double sub(double a, double b) {
		System.out.printf("Subtracition of %f and %f is %f", a, b, (a - b));
		return a - b;
	}

	public double mul(double a, double b) {
		System.out.printf("Multiplication  of %f and %f is %f", a, b, (a * b));
		return a * b;
	}

	public double div(double a, double b) {
		if(b==0)
			throw new IllegalArgumentException("division by zero error ");
		System.out.printf("Division of %f and %f is %f", a, b, (a / b));
		return a / b;
	}

}
