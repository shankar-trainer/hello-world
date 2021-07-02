package com.cts.error;

import java.util.Scanner;

public class Interestcaluclation {

	Scanner scanner=new Scanner(System.in);
	
	float amt,rate;
	int time;
	
	float intCalc() throws Exception{
	   System.out.println("Enter amount");
	   amt=scanner.nextFloat();
	   if(amt<=0)
		   throw  new Exception("invalid amount");
	   
	   System.out.println("Enter time");
	   time=scanner.nextInt();
	   if(time<=0)
		   throw  new Exception("invalid time");
	   
	   System.out.println("Enter rate");
	   rate=scanner.nextFloat();
	   if(rate<=0)
		   throw  new Exception("invalid rate");
	   return amt*rate*time/100;
	}
	
	public static void main(String[] args) {
		 Interestcaluclation interestcaluclation=new Interestcaluclation();
		 try {
			System.out.println("Interest is "+interestcaluclation.intCalc());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
}
