package com.cognizant.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatExample {

	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date);
		
		DateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		
		String format = dateFormat.format(date);
		System.out.println(format);
		
		dateFormat=new SimpleDateFormat("dd-MMM-yyyy");
		System.out.println(dateFormat.format(date));
		
		dateFormat=new SimpleDateFormat("dd-MMMMM-yyyy EE");
		System.out.println(dateFormat.format(date));
		dateFormat=new SimpleDateFormat("dd-MMMMM-yyyy EEEEE");
		System.out.println(dateFormat.format(date));
	}
}
