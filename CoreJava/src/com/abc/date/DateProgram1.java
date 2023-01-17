package com.abc.date;

import java.util.Date;

public class DateProgram1 {

	public static void main(String[] args) {
		Date date=new Date();// current date and time 
		System.out.println(date);
		
		Date date1=new Date(1);// arg is millisecond since 1st jan 5:30 1970 
		
		System.out.println(date1);
		
		Date date2=new Date(1000L*60*60*24*30);//date after 30 days 
		System.out.println(date2);
		
		Date date3=new Date(1000L*60*60*24*365);
		
		System.out.println(date3);
	}
}
