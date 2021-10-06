package org.com;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		int c;
		String s="null";
		try {
			c = a / b;
			System.out.println("Result is " + c);
		  System.out.println("string length is "+s.length());
		} catch (ArithmeticException e) {
			System.out.println("divided by zero ");

		} 
		catch (NullPointerException e) {
			System.out.println("null error ");
			e.printStackTrace();
		}
		catch (Throwable e) {
			// System.out.println("some error ");
			System.out.println(e.getMessage());
			
		}
		finally {
			System.out.println("finally is running");
		}
		System.out.println("end of program ");

	}
}
