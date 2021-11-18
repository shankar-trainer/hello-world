package com.capgemini.error;

import java.util.Scanner;

public class InterestCalculation {

	private int time;
	private float amount;
	private float rate;

	Scanner sc = null;

	public InterestCalculation() {
		sc = new Scanner(System.in);
	}

	float interestCalc() {
		System.out.println("Enter amount");
		amount = sc.nextFloat();

		if (amount <= 0)
			throw new RuntimeException("invalid amount");

		System.out.println("Enter time");
		time = sc.nextInt();

		if (time <= 0)
			throw new RuntimeException("invalid time");

		System.out.println("Enter rate");
		rate = sc.nextFloat();

		if (rate <= 0)
			throw new RuntimeException("invalid rate");

		return amount * rate * time / 100;
	}

	public static void main(String[] args) {
		try {
			System.out.println("Interest is " + new InterestCalculation().interestCalc());
		} catch (RuntimeException e) {
			System.err.println(e.getMessage());
		}
	}
}
