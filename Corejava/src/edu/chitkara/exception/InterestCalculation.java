package edu.chitkara.exception;

import java.util.Scanner;

public class InterestCalculation {
	Scanner scanner;
	float amt;
	float rate;
	int time;

	public InterestCalculation() {
		scanner = new Scanner(System.in);
	}

	float calc() {
		System.out.println("Enter amount ");
		amt = scanner.nextFloat();
		if (amt <= 0)
			throw new RuntimeException("invalid amount");

		System.out.println("Enter rate ");
		rate = scanner.nextFloat();

		if (rate <= 0)
			throw new RuntimeException("invalid rate");

		System.out.println("Enter time ");
		time = scanner.nextInt();
		if (time <= 0)
			throw new RuntimeException("invalid time");

		return (amt * rate * time / 100);

	}

	public static void main(String[] args) {
		InterestCalculation calculation = new InterestCalculation();
		try {
			System.out.println("Interest is " + calculation.calc());
		} catch (RuntimeException e) {
			System.err.println(e.getMessage());
		}
	}

}
