package edu.lpu.exception;

public class CalculationPrg2 {

	public static  int  divide(int a, int b) throws Exception {
		if(b==0)
			throw new Exception("denominator should not be zero");
		else
			return a/b;
	}
	
	public static void main(String[] args) {
	System.out.println("program starts ");
		int a=10,b=0;

		int c;
		try {
			c = divide(a, b);
			System.out.println("division of "+a+" and "+b+" is "+c);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			//e.printStackTrace();
		}
		System.out.println("program ends ");
		
	}
	
}
