package com.capgemini.exception;

import java.util.Scanner;

public class InterestCalculation {

	private float amount;
	private float rate;
	private int time;
	Scanner sc;

	public InterestCalculation() {
		sc = new Scanner(System.in);
	}

	float calculation() {
		System.out.println("Enter amount");
		amount=sc.nextFloat();
		if(amount<=0)
			//System.out.println("invalid amount");
		throw new RuntimeException("invalid amount");
		
		System.out.println("Enter rate");
		rate=sc.nextFloat();
		if(rate<=0)
		//	System.out.println("invalid rate");
			throw new RuntimeException("invalid rate");
		
		System.out.println("Enter time");
		time=sc.nextInt();
		if(time<=0)
	//		System.out.println("invalid time");
			throw new RuntimeException("invalid time");
		
		return amount*rate*time/100;
	}

	public static void main(String[] args) {
		try {
		InterestCalculation calc = new InterestCalculation();
		System.out.println("Interest is " + calc.calculation());
		}
		catch(RuntimeException e) {
		  System.err.println(e.getMessage());	
		}
	}
}
