package edu.lpu.exception;

public class CalculationPrg1 {

	public static  int  divide(int a, int b) {
		if(b==0)
			throw new ArithmeticException("denominator should not be zero");
		else
			return a/b;
	}
	
	public static void main(String[] args) {
		int a=10,b=0;
		try{
		int c=divide(a, b);
		System.out.println("division of "+a+" and "+b+" is "+c);
		}
		catch(ArithmeticException e) {
			System.err.println(e.getMessage());
		}
	}
	
}
