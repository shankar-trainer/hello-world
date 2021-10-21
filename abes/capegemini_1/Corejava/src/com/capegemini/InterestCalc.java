package com.capegemini;
import java.util.Scanner;

public class InterestCalc {
	private float amt;
	private int time;
	private float rate;
	private float interest_amt;
	Scanner scanner;
	 
	public InterestCalc() {
	   scanner=new Scanner(System.in);
	}
		
	float interestCalulate() throws Exception{
		System.out.println("Enter amount");
		amt=scanner.nextFloat();
		if( amt<=0)
			//System.out.println("amount is -ve");
			throw new Exception("amount is -ve");
		
		System.out.println("Enter time");
		time=scanner.nextInt();
		
		if( time<=0)
			//System.out.println("time is -ve");
			throw new Exception("time is -ve");
		
		System.out.println("Enter rate");
		rate=scanner.nextFloat();
		
		if( rate<=0)
			//System.out.println("rate is -ve");
		throw new Exception("rate is -ve");

		return amt*rate*time/100;
	}
	
	public static void main(String[] args) {
		InterestCalc calc=new InterestCalc();
		try {
			calc.interest_amt=calc.interestCalulate();
		} catch (Exception e) {
		   System.out.println(e.getMessage());
		}
		System.out.println("Interest is "+calc.interest_amt);
	}	
}
