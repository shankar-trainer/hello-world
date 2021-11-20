package com.capgemini.format;

import java.text.DateFormat;
import java.util.Date;

public class DateFormatExample1 {

	public static void main(String[] args) {

		Date d1 = new Date();
		System.out.println(d1);

		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
		String s1 = dateFormat.format(d1);

		System.out.println("full date " + s1);
		
		dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("mediums date " + dateFormat.format(d1));
		
		System.out.println();
		
		dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("long date " + dateFormat.format(d1));
		
		dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("short  date " + dateFormat.format(d1));

	}
}
