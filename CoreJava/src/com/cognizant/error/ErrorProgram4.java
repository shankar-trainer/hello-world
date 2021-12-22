package com.cognizant.error;

public class ErrorProgram4 {

	public void division(int a, int b) {
		System.out.println("Division of  " + a + " / " + b + " is " + (a / b));
	}

	public static void main(String[] args) {
		System.out.println("program starts ");
         String name=null;
		ErrorProgram4 program4 = new ErrorProgram4();
		program4.division(11, 3);
		try {
			program4.division(11, 12);
			//System.out.println(name.charAt(0));
		} catch (ArithmeticException e) {
			System.err.println("divided by zero error\n" + e.getMessage());
			// System.out.println("divided by zero error");
			// e.printStackTrace();
		} catch (Exception e) {
			System.out.println("error " + e);
		}
		System.out.println("program ends ");
	}
}
