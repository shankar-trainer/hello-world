package edu.chitkara.exception;

public class MyCalculator {
	static long power(int a, int b) throws Exception {
		long pow = 1;
		if (a < 0 || b < 0)
			throw new Exception("n or p should not be negative");

		else if (a == 0 && b == 0)
			throw new Exception("n or p should not be zero");
		else {
			for (int i = 1; i <= b; i++) {
				pow = pow * a;
			}
		}
		return pow;
	}

	public static void main(String args[]) {
		try {
			System.out.println(power(3, 5));
			System.out.println(power(2, 4));
			System.out.println(power(0, 0));
			System.out.println(power(-1, -2));
			System.out.println(power(-1, 3));
		} catch (Exception e) {
			System.err.println(e);
		}

	}
}
