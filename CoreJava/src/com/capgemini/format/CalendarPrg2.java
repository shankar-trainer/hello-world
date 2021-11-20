package com.capgemini.format;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarPrg2 {

	public static void main(String[] args) {

		// GregorianCalendar calendar=new GregorianCalendar(2022,11,30);
		GregorianCalendar calendar = new GregorianCalendar(2022, 11, 30, 01, 33, 55);

		System.out.println(calendar.get(Calendar.DAY_OF_MONTH) + "/" + (calendar.get(Calendar.MONTH) + 1) + "/"
				+ calendar.get(Calendar.YEAR)+"  ");

		System.out.println("day of week "+calendar.get(Calendar.DAY_OF_WEEK) );
				
		System.out.println(calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":"
				+ calendar.get(Calendar.SECOND));

		
	}
}
