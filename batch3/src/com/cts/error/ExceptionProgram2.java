package com.cts.error;

public class ExceptionProgram2 {

	public static void main(String[] args) {
		int x=10;
		int y=0;
		try {
		int z=x/y;
		
		System.out.println(z);
		}
		catch (ArithmeticException e) {
			System.out.println("divided by zero error ");
		  //  e.printStackTrace();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		catch (Throwable e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}
	}
}
