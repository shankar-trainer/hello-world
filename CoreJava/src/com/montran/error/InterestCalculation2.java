package com.montran.error;

import java.util.Scanner;

public class InterestCalculation2 {

	private float amt;
	private float rate;
	private int time;

	Scanner scanner;

	public InterestCalculation2() {
		scanner = new Scanner(System.in);
	}

	float interestCalc() throws Exception {

		System.out.println("Enter amount ");
		amt = scanner.nextFloat();
		try {
			if (amt <= 0)
				throw new Exception("invalid amount");
		} catch (Exception e) {
			System.err.println("exception at method " + e.getMessage());
			// throw e;
		}
		System.out.println("Enter rate ");
		rate = scanner.nextFloat();
		if (rate <= 0)
			throw new Exception("invalid rate");

		System.out.println("Enter time ");
		time = scanner.nextInt();
		if (time <= 0)
			throw new Exception("invalid time");

		return amt * rate * time / 100;
	}

	public static void main(String[] args) {

		InterestCalculation2 calculation = new InterestCalculation2();
		float res;
		try {
			res = calculation.interestCalc();
			System.out.println("Interest is " + res);
		} catch (Exception e) {
			System.err.println("main method " + e.getMessage());
		}

	}
}
