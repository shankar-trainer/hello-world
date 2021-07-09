package org.cognizant.error;

import java.util.Scanner;

public class InterestCalculation {

	private Scanner sc;
	private float amount;
	private int time;
	private float rate;

	public InterestCalculation() {
		sc = new Scanner(System.in);
	}

	float intCalc() {
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
		InterestCalculation interestCalculation = new InterestCalculation();
		try {
			System.out.println(interestCalculation.intCalc());
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}
}
