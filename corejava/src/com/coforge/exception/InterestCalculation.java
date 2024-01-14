package com.coforge.exception;

import java.util.Scanner;

public class InterestCalculation {
	float amt;
	float rate;
	int time;

	Scanner scanner;

	public InterestCalculation() {
		scanner = new Scanner(System.in);
	}

	float interestCalc() {
      System.out.println("Enter amount");
      amt=scanner.nextFloat();
      if(amt<=0)
    	  throw new  RuntimeException("invalid amount");
      
      System.out.println("Enter rate");
      rate=scanner.nextFloat();
      
      if(rate<=0)
    	  throw new  RuntimeException("invalid rate");
      
      System.out.println("Enter time");
      time=scanner.nextInt();

      if(time<=0)
    	  throw new  RuntimeException("invalid time");
      
      return amt*rate*time/100;
	}

	public static void main(String[] args) {
		System.out.println("program starts ");
		try {
		System.out.println("Interest is "+new InterestCalculation().interestCalc());
		}
		catch (RuntimeException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("program ends ");
		}
}
