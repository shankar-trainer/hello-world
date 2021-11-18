package com.capgemini.error;

import java.util.Scanner;

public class InterestCalculation {

	private int time;
	private float amount;
	private float rate;

	Scanner sc = null;

	public InterestCalculation() {
		sc = new Scanner(System.in);
	}

	float interestCalc() throws Exception  {
		System.out.println("Enter amount");
		amount = sc.nextFloat();
        try {
   		if (amount <= 0)
			throw new Exception("invalid amount");
        }
        catch (Exception e) {
        	System.err.println("inside method  error is "+e.getMessage());
		 throw e; // rethrowing 
        }
		System.out.println("\nEnter time");
		time = sc.nextInt();

		if (time <= 0)
			throw new Exception("invalid time");

		System.out.println("Enter rate");
		rate = sc.nextFloat();

		if (rate <= 0)
			throw new Exception("invalid rate");

		return amount * rate * time / 100;
	}

	public static void main(String[] args) 
		//	throws Exception 
	    {
		
			try {
				System.out.println("Interest is " + new InterestCalculation().interestCalc());
			} catch (Exception e) {
				System.err.println("message at main method "+e.getMessage());
			}
		
	}
}
