package edu.coforge.java8;

import java.util.Date;

public class DatePrg1 {

	public static void main(String[] args) {
		
		Date date=new Date();
		
		System.out.println(date);
		date=new Date(1000);

		
		System.out.println(date);
		
		// java.util.Date is date+time both
		// it is mutable 
		
		//java8 date is separate class, time is separate class
		// these are immutable 
		
		
	}
}
