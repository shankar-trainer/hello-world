package com.audintel.error;

import java.util.Scanner;

public class InterestCalculation {
	float amt;
	float rate;
	int time;
	Scanner sc = new Scanner(System.in);

	float interest() throws Exception {
		System.out.println("Enter amount");
		amt = sc.nextFloat();
		try {
			if (amt <= 0)
				throw new Exception("amount is invalid");
		} catch (Exception e) {
			System.err.println("in interest method " + e.getMessage());
			throw e;
		}

		System.out.println("Enter rate");
		rate = sc.nextFloat();

		if (rate <= 0)
			try {
				throw new Exception("invalid rate");
			} catch (Exception e) {
				System.err.println("in interest method " + e.getMessage());
				throw e;
			}

		System.out.println("Enter time");
		time = sc.nextInt();

		if (time <= 0)
			try {
				throw new Exception("invalid time ");
			} catch (Exception e) {
				System.err.println("in interest method " + e.getMessage());
				throw e;
			}

		return amt * rate * time / 100;
	}

	public static void main(String[] args) {

		System.out.println("program starts ");
		try {
			System.out.println("Interest is " + new InterestCalculation().interest());
		} catch (Exception e) {
			System.err.println("in main error is " + e.getMessage());
		}
		System.out.println("program ends  ");
	}
}
