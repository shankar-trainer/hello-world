package com.cts.Exception;

import java.util.Scanner;

public class ExceptionDemo5 {

	int amt;
	int time;
	float rate;
	Scanner scanner = new Scanner(System.in);

	float intCalc() throws Exception {
		System.out.println("Enter amount");
		amt = scanner.nextInt();
		if (amt <= 0)
			throw new Exception("amount is -ve");

		System.out.println("Enter time");
		time = scanner.nextInt();

		if (time <= 0)
			throw new Exception("time is -ve");

		System.out.println("Enter rate");
		rate = scanner.nextInt();
		if (rate <= 0)
			throw new Exception("rate is -ve");

		return amt * rate * time / 100;
	}

	public static void main(String[] args) {
		System.out.println("Program starts ");
		try {
			System.out.println("interest is " + new ExceptionDemo5().intCalc());
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		finally {
			System.out.println("finally block excutes");
		}

		System.out.println("Program ends ");

	}
}
