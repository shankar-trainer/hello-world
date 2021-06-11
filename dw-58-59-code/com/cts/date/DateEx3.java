package com.cts.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx3 {

	public static void main(String[] args) {
		Date date=new Date();
		DateFormat dateFormat=DateFormat.getDateInstance(DateFormat.LONG);
		
		System.out.println(date);

		String format = dateFormat.format(date);
		System.out.println("long date "+format);
		
		dateFormat=DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("medium date "+dateFormat.format(date));
		
		dateFormat=DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("short date "+dateFormat.format(date));
		
		SimpleDateFormat dateFormat2=new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("short date "+dateFormat2.format(date));
		
//		dateFormat2=new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a Z");
		dateFormat2=new SimpleDateFormat("dd-MMMMM-yyyy hh:mm:ss a Z");
		System.out.println("short date "+dateFormat2.format(date));
		
		dateFormat2=new SimpleDateFormat("dd-MMMMM-yyyy EEEEE hh:mm:ss a Z");
		System.out.println("short date "+dateFormat2.format(date));
		
		
	}
	
}
