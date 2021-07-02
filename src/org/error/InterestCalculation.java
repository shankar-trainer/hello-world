package org.error;

import java.util.Scanner;

public class InterestCalculation {
	Scanner sc = new Scanner(System.in);

	float amt, rate;
	int time;

	float intCalc() {
		System.out.println("Enter amount");
		amt = sc.nextFloat();
		if (amt <= 0)
			  throw new RuntimeException("invalid amount ");

		System.out.println("Enter time");
		time = sc.nextInt();
		if (time <= 0)
			 throw new RuntimeException("invalid time ");

		System.out.println("Enter rate");
		rate = sc.nextFloat();
		if (rate <= 0)
			 throw new RuntimeException("invalid rate ");

		return (amt * rate * time / 100);
	}

	public static void main(String[] args) {
		InterestCalculation calculation = new InterestCalculation();
		try {
		System.out.println("Interest is " + calculation.intCalc());
		}
		catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		}
}
