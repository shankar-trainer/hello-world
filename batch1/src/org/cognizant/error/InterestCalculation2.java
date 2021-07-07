package org.cognizant.error;

import java.util.Scanner;

public class InterestCalculation2 {

	private Scanner sc;
	private float amount;
	private int time;
	private float rate;

	public InterestCalculation2() {
		sc = new Scanner(System.in);
	}

	float intCalc() throws Exception  {
		System.out.println("Enter amount");
		amount = sc.nextFloat();
		try {
		if (amount <= 0)
			throw new Exception("invalid amount");
		}
		catch (Exception e) {
			System.out.println("inside intCalc error is "+e.getMessage());
  	  throw e;
		}
		System.out.println("Enter time");
		time = sc.nextInt();

		if (time <= 0)
			throw new Exception("invalid time");

		System.out.println("Enter rate");
		rate = sc.nextFloat();

		if (rate <= 0)
			throw new Exception("invalid rate");

		return amount * rate * time / 100;
	}

	public static void main(String[] args) {
		InterestCalculation2 interestCalculation = new InterestCalculation2();
		try {
			System.out.println(interestCalculation.intCalc());
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("inside main method error is "+e.getMessage());
			System.out.println("error cause  is "+e.getCause());
		}
	}
}
