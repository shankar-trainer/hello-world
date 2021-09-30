package com.capgemini.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDf {

	public static void main(String[] args) {
		Date date1 = new Date();
		System.out.println(date1);

		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);
		String s = df.format(date1);

		System.out.println("long format " + s);
		df = DateFormat.getDateInstance(DateFormat.SHORT);

		System.out.println("short date  format " + df.format(date1));
		df = DateFormat.getDateInstance(DateFormat.MEDIUM);

		System.out.println("medium date  format " + df.format(date1));

		// Custom date using SimpleDateFormat
		
		// dd -- date MM -- month (02) MMM --feb  MMMMM -- February 

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(sdf.format(date1));
		
		sdf = new SimpleDateFormat("dd-MMM-yyyy");
		System.out.println(sdf.format(date1));
		
		sdf = new SimpleDateFormat("dd-MMMMM-yyyy");
		System.out.println(sdf.format(date1));
		
		
		//EE   -- week days  EE WED   EEEEEE-Wednesday 
		
		sdf = new SimpleDateFormat("dd-MMMMM-yyyy   EEEEE");
		System.out.println(sdf.format(date1));
		
		
	}
}
