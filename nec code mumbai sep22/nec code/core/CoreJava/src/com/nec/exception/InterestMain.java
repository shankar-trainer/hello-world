package com.nec.exception;

public class InterestMain {

	public static void main(String[] args) {
		
		InterestCalculation calculation=new InterestCalculation();
		try {
			calculation.input();
			System.out.println("Interest is "+calculation.interest());
		} catch (Exception e) {
			
			System.err.println("problem in intput values \n"+e.getMessage());
		}
		
		
	}
}
