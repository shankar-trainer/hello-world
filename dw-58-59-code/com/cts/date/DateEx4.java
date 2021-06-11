package com.cts.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx4 {

	public static void main(String[] args) {
		Date date = new Date();

		SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd-MMM-yyyy");

		String s = "10-01-2021";
		try {
			Date parse = dateFormat2.parse(s);
			System.out.println(parse+"  "+s);
		} catch (ParseException e) {
		  System.out.println("date not in given format ");
		}

	}

}
