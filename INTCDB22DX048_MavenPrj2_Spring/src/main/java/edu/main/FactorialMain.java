package edu.main;

import com.cts.model.Factorial;

public class FactorialMain {

	public static void main(String[] args) {
		int x = 7;

		System.out.println("factorial of " + x + " is " + Factorial.getFactorial(x));
		x = 4;
		System.out.println("factorial of " + x + " is " + Factorial.getFactorial(x));
	}
}
