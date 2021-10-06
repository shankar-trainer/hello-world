package org.com;

import java.util.Scanner;

public class InterestCalc {

	float amt;
	int time;
	float rate;
	float int_amt;
	
	Scanner scanner=new Scanner(System.in);
	
	float calc() throws Exception  {
	
		System.out.println("Enter amount ");
		amt=scanner.nextFloat();
		if(amt<=0)
			//System.out.println("amount is -ve");
		   throw new Exception("amount is -ve");
		
		System.out.println("Enter time ");
		time=scanner.nextInt();
		if(time<=0)
			//System.out.println("time is -ve");
			   throw new Exception("time is -ve");
		
		
		System.out.println("Enter rate ");
		rate=scanner.nextFloat();
		
		if(rate<=0)
			//System.out.println("rate is -ve");
			   throw new Exception("rate is -ve");
		
		int_amt=amt*rate*time/100;
		return int_amt;
	}
	
	public static void main(String[] args) {
		InterestCalc calc=new InterestCalc();
		try {
			System.out.println("Interest is "+calc.calc());
		} catch (Exception e) {
			// TODO Auto-generated catch block
System.out.println(e.getMessage());
		}
		
	}
	
}
