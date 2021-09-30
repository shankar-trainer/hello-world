package com.capgemini.date;

import java.util.Date;

public class DateDemo1 {

	public static void main(String[] args) {
		
		Date date=new Date();
		Date date10=new Date();
		System.out.println("current date and time "+date);
		// date start from jan 1 1970
		Date date1=new Date(1);
		
		System.out.println(date1);
		
		Date date2=new Date(1000*60*60*24);
		
		System.out.println(date2);
		Date date3=new Date(365*1000L*60*60*24);
		System.out.println(date3);
		
		System.out.println(date3.after(date1));
		System.out.println(date2.after(date1));
		System.out.println(date2.before(date1));
		System.out.println(date1.before(date2));
		System.out.println(date.equals(date10));
		
		
		System.out.println("\n compareTo \n");
		
		System.out.println(date.compareTo(date10));
		System.out.println(date.compareTo(date1));
		System.out.println(date2.compareTo(date10));
		

		
		
		
	}
}
