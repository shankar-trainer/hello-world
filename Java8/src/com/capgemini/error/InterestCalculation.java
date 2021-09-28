package com.capgemini.error;

import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class InterestCalculation {

	float amt;
	int time;
	float rate;

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
			throw new RuntimeException("invalid rate");
		return amt * rate * time / 100;
	}

	public static void main(String[] args) {
		System.out.println("program starts  ");
		try {
			System.out.println("Interest is " + new InterestCalculation().interestCalc());
		} catch (RuntimeException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("program ends ");
	}

}
