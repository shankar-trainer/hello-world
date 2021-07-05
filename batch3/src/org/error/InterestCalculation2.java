package org.error;

import java.util.Scanner;

public class InterestCalculation2 {
	Scanner sc = new Scanner(System.in);

	float amt, rate;
	int time;

	float intCalc() throws Exception {
		System.out.println("Enter amount");
		amt = sc.nextFloat();
		try {
		if (amt <= 0)
			  throw new Exception("invalid amount ");
		}
		catch (Exception e) {
			System.out.println("error at intCalc method "+e.getMessage());
		    throw e;
		}
		System.out.println("Enter time");
		time = sc.nextInt();
		if (time <= 0)
			 throw new Exception("invalid time ");

		System.out.println("Enter rate");
		rate = sc.nextFloat();
		if (rate <= 0)
			 throw new Exception("invalid rate ");            

		return (amt * rate * time / 100);
	}

	public static void main(String[] args) {
		InterestCalculation2 calculation = new InterestCalculation2();
		try {
			System.out.println("Interest is " + calculation.intCalc());
		} catch (Exception e) {
		System.err.println("in main method error is "+e.getMessage());
		}
		
		}
}
