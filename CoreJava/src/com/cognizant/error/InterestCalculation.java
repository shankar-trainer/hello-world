package com.cognizant.error;
import java.util.Scanner;

public class InterestCalculation {

	float amt, rate;
	int time;
	Scanner scanner;

	public InterestCalculation() {
		scanner = new Scanner(System.in);
	}

	float calc() {
		System.out.println("Enter amount");
		amt = scanner.nextFloat();

		if (amt <= 0)
			throw new RuntimeException("inavlid amount");

		System.out.println("Enter rate");
		rate = scanner.nextFloat();
		if (rate <= 0)
			throw new RuntimeException("inavlid rate");

		System.out.println("Enter time");
		time = scanner.nextInt();

		if (time <= 0)
			throw new RuntimeException("invalid time");
		return amt * rate * time / 100;
	}

	public static void main(String[] args) {
		InterestCalculation calculation = new InterestCalculation();
		try {
		System.out.println("Interest is " + calculation.calc());
		}
		catch (RuntimeException e) {
			System.err.println("error is "+e.getMessage());
		}
	}

}
