package com.capgemini.format;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarExample1 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();

		System.out.println(calendar.get(Calendar.DAY_OF_MONTH) + "/" + (calendar.get(Calendar.MONTH) + 1) + "/"
				+ calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":"
				+ calendar.get(Calendar.SECOND));

		calendar = Calendar.getInstance(TimeZone.getTimeZone("America/Los_Angeles"));

		System.out.println("America/Los_Angeles date and time");
		
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH) + "/" + (calendar.get(Calendar.MONTH) + 1) + "/"
				+ calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":"
				+ calendar.get(Calendar.SECOND));
		
		
		calendar.add(Calendar.HOUR, 10);
		System.out.println(calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":"
				+ calendar.get(Calendar.SECOND));
		

		calendar.add(Calendar.MONTH, 4);
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH) + "/" + (calendar.get(Calendar.MONTH) + 1) + "/"
				+ calendar.get(Calendar.YEAR));
		
		

	}

}
