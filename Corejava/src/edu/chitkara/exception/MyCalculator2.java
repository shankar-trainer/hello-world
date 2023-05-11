package edu.chitkara.exception;

import java.util.Scanner;

public class MyCalculator2 {
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
		Scanner sc = new Scanner(System.in);
		int ar[][] = new int[5][2];
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[0].length; j++) {
				ar[i][j] = sc.nextInt();
			}
		}
		 for (int i = 0; i < ar.length; i++) {
		
			try {
				System.out.println(power(ar[i][0], ar[i][1]));
			} catch (Exception e) {
				System.err.println(e);
			}
					
		}

	}

}