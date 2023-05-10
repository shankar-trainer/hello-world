package edu.chitkara.exception;

public class CheckedException {
	static int addition(int a, int b) throws Exception {
		if (b == 0) {
			try {
			throw new Exception("denominator can not be zero");
			}
			catch (Exception e) {
			System.err.println("inside addition method error is  "+e.getMessage());
			 throw e;
			}
		}
		else
			return a / b;
	//	return 0;
	}

	public static void main(String[] args) {
		System.out.println("program starts");
		int a = 10;
		int b = 0;
		try {
			System.out.println("division of " + a + " and " + b + " is " + addition(a, b));
		} catch (Exception e) {
			System.err.println("main method error "+e.getMessage());
		}

		System.out.println("program ends ");
	}

}
