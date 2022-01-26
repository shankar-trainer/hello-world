package edu.lpu.exception;

import java.util.Scanner;

public class InterestCalculation2 {

	private float amt;
	private int time;
	private float rate;
	Scanner scanner;

	public InterestCalculation2() {
		scanner = new Scanner(System.in);
	}

	float interestCalc() throws Exception {
		System.out.println("Enter amount");
		amt = scanner.nextFloat();
		if (amt <= 0)
			throw new Exception("invalid amount");

		System.out.println("Enter time");
		time = scanner.nextInt();

		if (time <= 0)
			throw new Exception("invalid time");
		System.out.println("Enter rate");
		rate = scanner.nextFloat();

		if (rate <= 0)
			throw new Exception("invalidrate");

		return amt * rate * time / 100;
	}

	public static void main(String[] args) {
		InterestCalculation2 calculation = new InterestCalculation2();
		try {
			System.out.println("Interest is " + calculation.interestCalc());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
