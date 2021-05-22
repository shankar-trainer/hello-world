package com.cts;

import java.util.Scanner;

public class ExceptionDemo3 {

	Scanner scanner;

	int amount;
	float rate;
	int time;

	public ExceptionDemo3() {
		scanner = new Scanner(System.in);
	}

	float intAmount() {
		System.out.println("Enter amount");
		amount = scanner.nextInt();
		if (amount < 0)
			// System.out.println("negative amount");
			throw new RuntimeException("negative amount");

		System.out.println("Enter rate");
		rate = scanner.nextFloat();
		if (rate < 0)
			// System.out.println("negative rate");
			throw new RuntimeException("negative rate");

		System.out.println("Enter Time");
		time = scanner.nextInt();

		if (time < 0)
			// System.out.println("negative time");
			throw new RuntimeException("negative time");

		return amount * rate * time / 100;
	}

	public static void main(String[] args) {
		System.out.println("program starts ");
		try {
			System.out.println(new ExceptionDemo3().intAmount());
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("program ends ");
	}

}
