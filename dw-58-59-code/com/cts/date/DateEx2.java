package com.cts.date;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateEx2 {

	public static void main(String[] args) {
		Date date1=new Date();
		System.out.println(date1);
	TimeZone timeZone=TimeZone.getDefault();	
		System.out.println(timeZone);
		System.out.println(timeZone.getDisplayName());
		System.out.println(timeZone.getID());
		
		TimeZone timeZone2=TimeZone.getTimeZone("America/Los_Angeles");
		
		System.out.println("\n america Los Angeles time zone\n ");
		System.out.println(timeZone2.getDisplayName());
		System.out.println(timeZone2.getID());

//		 Calendar cal1=Calendar.getInstance();
		 Calendar cal1=Calendar.getInstance(timeZone2);
		 
		 System.out.println
		 (cal1.get(Calendar.DATE)+"/"+cal1.get(Calendar.MONTH)+"/"+cal1.get(Calendar.YEAR));
	
		 cal1.add(Calendar.HOUR,20);
		 cal1.add(Calendar.DATE,20);
		 
		 System.out.println
		 (cal1.get(Calendar.HOUR)+":"+cal1.get(Calendar.MINUTE)+":"+cal1.get(Calendar.SECOND));
		 
		
	}
}
