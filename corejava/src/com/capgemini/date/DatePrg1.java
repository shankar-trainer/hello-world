package com.capgemini.date;

import java.text.DateFormat;
import java.util.Date;

public class DatePrg1 {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		DateFormat dateformat = DateFormat.getDateInstance(DateFormat.LONG);
		String s1 = dateformat.format(date);
		System.out.println("date in long format " + s1);

		dateformat = DateFormat.getDateInstance(DateFormat.MEDIUM);

		System.out.println("date in medium  format " + dateformat.format(date));

	}
}
