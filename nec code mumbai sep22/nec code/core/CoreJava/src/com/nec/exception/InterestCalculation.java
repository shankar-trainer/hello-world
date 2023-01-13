package com.nec.exception;

import java.util.Scanner;

public class InterestCalculation {

	private float amt;
	private float rate;
	private int time;
	Scanner sc;

	public InterestCalculation() {
		sc = new Scanner(System.in);
	}

	void input() throws Exception // throws Exception
	{
		System.out.println("Enter amount");
		amt = sc.nextFloat();
		try {
			if (amt <= 0)
				// throw new RuntimeException("invalid amount");// RuntimeException is unchecked
				// Exception
				throw new Exception("invalid amount");

			System.out.println("Enter time");
			time = sc.nextInt();

			if (time <= 0)
				throw new Exception("invalid time");

			System.out.println("Enter rate");
			rate = sc.nextFloat();

			if (rate <= 0)
				throw new Exception("invalid rate");
		} catch (Exception e) {
			System.err.println("error at "+getClass().getName()+" is "+e.getMessage());
		   
			throw e;
		}
	}

	float interest() {
		return amt * time * rate / 100;
	}

}
