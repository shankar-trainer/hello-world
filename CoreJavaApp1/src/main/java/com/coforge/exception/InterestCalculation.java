package com.coforge.exception;

import java.util.Scanner;

public class InterestCalculation {

	float amt;
	float rate;
	int time;
	Scanner sc = new Scanner(System.in);

	float interest() throws Exception {
		System.out.println("Enter amount");
		amt = sc.nextFloat();
		if (amt <= 0)
			throw new Exception("invalid amount");

		System.out.println("Enter rate");
		rate = sc.nextFloat();
		if (rate <= 0)
			throw new Exception("invalid rate");

		System.out.println("Enter time");
		time = sc.nextInt();

		try {
			if (time <= 0)
				throw new Exception("invalid time");
		} catch (Exception e) {
			System.out.println("interest  method catch");
			System.err.println(e.getMessage());
			throw e;
		}
		return amt * rate * time / 100;

	}

	public static void main(String[] args) {
		InterestCalculation calculation = new InterestCalculation();
		try {
			System.out.println("Interest is " + calculation.interest());
		} catch (Exception e) {
			System.out.println("main method catch");
			System.err.println(e.getMessage());
		}

	}
}
