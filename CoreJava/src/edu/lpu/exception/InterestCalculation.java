package edu.lpu.exception;

import java.util.Scanner;

public class InterestCalculation {

	private float amt;
	private int time;
	private float rate;
	Scanner scanner;

	public InterestCalculation() {
		scanner = new Scanner(System.in);
	}

	float interestCalc() {
		System.out.println("Enter amount");
		amt = scanner.nextFloat();
		if (amt <= 0)
			throw new RuntimeException("invalid amount");

		System.out.println("Enter time");
		time = scanner.nextInt();

		if (time <= 0)
			throw new RuntimeException("invalid time");
		System.out.println("Enter rate");
		rate = scanner.nextFloat();

		if (rate <= 0)
			throw new RuntimeException("invalidrate");

		return amt * rate * time / 100;
	}

	public static void main(String[] args) {
		InterestCalculation calculation = new InterestCalculation();
		try {
			System.out.println("Interest is " + calculation.interestCalc());
		} catch (RuntimeException e) {
			System.err.println(e.getMessage());
		}
	}
}
