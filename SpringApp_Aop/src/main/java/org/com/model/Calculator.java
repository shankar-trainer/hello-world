package org.com.model;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

	public int addition(int a, int b) {
		System.out.println("sum of " + a + " and " + b + " is " + (a + b));
		return a + b;
	}

	public int division(int a, int b) {
		if (b == 0)
			throw new IllegalArgumentException("divided by zero error");
		else {
			System.out.println("division of " + a + " and " + b + " is " + (a / b));

			return a / b;
		}
	}

}
