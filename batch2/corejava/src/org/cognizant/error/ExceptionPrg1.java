package org.cognizant.error;

public class ExceptionPrg1 {

	public static void main(String[] args) {
		int x=10;
		int y=2;

		try {
		int z=x/y;
		System.out.println("Division Result is "+z);
		}
		catch (ArithmeticException e) {
			System.out.println("divided by zero");
		}
		catch (Exception e) {
			System.out.println(e);
		}
		catch (Throwable e) {
			System.out.println(e);
		}
		
		
		finally {
			System.out.println("finally called");
		}
	}
}
