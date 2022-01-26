package edu.lpu.exception;

public class ReThrowCalculationPrg3 {

	public  int divide(int a, int b) throws Exception{
		 
			try {
				if (b == 0)
				throw new Exception("denominator should not be zero");
				else 
				return a / b;
			} catch (Exception e) {
				System.err.println("error at divide method " + e.getMessage());
			}
		return a/b;	
	}

	public static void main(String[] args) {
		int a = 10, b = 0;
		try {
			int c =  new ReThrowCalculationPrg3(). divide(a, b);
			System.out.println("division of " + a + " and " + b + " is " + c);
		} catch (Exception e) {
			System.err.println("error at  main method " + e.getMessage());
		}
	}

}
