package com.cognizant.error;

public class ErrorProgram3 {

	public static void main(String[] args) {
		System.out.println("program starts ");
		int ar[] = { 1, 2, 3, 4 };
		String name = null;
		try {
			 System.out.println(ar[4]);
			//System.out.println(ar[2]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("index error ");
		}
		catch (ArithmeticException e) {
			System.err.println("divided by zero error ");
		}

		catch (Exception e) {
			System.err.println("error is " + e);
		}

		try {
			System.out.println("name is " + name);
			System.out.println("length of name is " + name.length());
		} catch (NullPointerException e) {
			System.err.println("Null value error  ");
		} catch (Exception e) {
			System.err.println("error is " + e);
		}
		System.out.println("program ends ");
	}
}
