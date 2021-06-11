package com.cts.error;

public class InterestCalculation2 {

	int amount;
	int time;
	float rate;

	float intCalc() throws Exception {
		try {
		if (amount < 0)
			throw new Exception("amount < 0");
		else if (time < 0)
			throw new Exception("time < 0");
		else if (rate < 0)
			throw new Exception("rate < 0");
		else
			return amount * time * rate / 100;
		}
		catch (Exception e) {
	     System.err.println("caught inside intCalc method  "+e.getMessage());
		  throw e; // rethrowing exception
		}
	}

	public static void main(String[] args) {

		try {
			InterestCalculation2 calculation = new InterestCalculation2();
			calculation.amount = -100;
			calculation.time = 12;
			calculation.rate = 5;
			System.out.println("Interest is " + calculation.intCalc());
		} catch (Exception e) {
			System.err.println("caught in main method \n"+e.getMessage());
		   // e.printStackTrace();
		  System.out.println("cause is "+e.getCause());
		}
	}
}
