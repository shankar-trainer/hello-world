package com.capegemini;

public class DivisionProgram {

	static void division(int a, int b) throws Exception 
			//throws Exception
	// ArithmeticException, RuntimeException
	{
		if (b == 0)
			throw new Exception("denominator is zero");
		else
			System.out.println("Division Result is " + (a / b));
	}

	public static void main(String[] args)
	// throws Exception
	{
		try {
			division(20, 0);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Program ends ");
	}
}
