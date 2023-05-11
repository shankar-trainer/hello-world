package edu.chitkara.exception;

import java.util.Scanner;

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
		Scanner sc = new Scanner(System.in);
		int ar[][] = new int[5][2];
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[0].length; j++) {
				ar[i][j] = sc.nextInt();
			}
		}
			try {
				System.out.println(power(ar[0][0], ar[0][1]));
			} catch (Exception e) {
				System.err.println(e);
			}
			try {
				System.out.println(power(ar[1][0], ar[1][1]));
			} catch (Exception e) {
				System.err.println(e);
			}
			try {
				System.out.println(power(ar[2][0], ar[2][1]));
			} catch (Exception e) {
				System.err.println(e);
			}
			try {
				System.out.println(power(ar[3][0], ar[3][1]));
			} catch (Exception e) {
				System.err.println(e);
			}
			try {
				System.out.println(power(ar[4][0], ar[4][1]));
			} catch (Exception e) {
				System.err.println(e);
			}
			
		}

	}

