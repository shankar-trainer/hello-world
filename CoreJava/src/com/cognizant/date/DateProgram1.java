package com.cognizant.date;

import java.util.Date;

public class DateProgram1 {

	public static void main(String[] args) {
		Date date=new Date();// current date and time
		
		System.out.println(date);
		
		Date date1=new Date(1);// constructor accepts values in long (milli second)
		
		System.out.println(date1);
		
		Date date2=new Date(1000L*60*60*24*31);
		System.out.println(date2);
		Date date3=new Date(1000L*60*60*24*365);
		System.out.println(date3);
	    
		System.out.println(date.getHours()+":"+date.getMinutes()+":"+date.getSeconds());
		
		System.out.println(date.getDate()+"/"+(date.getMonth()+1)+"/"+(date.getYear()+1900));
		
	}
}
