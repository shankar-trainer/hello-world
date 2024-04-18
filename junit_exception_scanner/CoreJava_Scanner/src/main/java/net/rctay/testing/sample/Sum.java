package net.rctay.testing.sample;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// by convention, number of cases - throw that away here
		sc.nextInt();

		int result = 0;
		int n = sc.nextInt();
		while (n-- > 0)
			result += sc.nextInt();

		System.out.println(result);
	}
}
