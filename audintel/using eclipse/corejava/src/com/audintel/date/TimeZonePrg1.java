package com.audintel.date;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TimeZonePrg1 {

	public static void main(String[] args) {

//		for (String s : TimeZone.getAvailableIDs())
		// System.out.println(s);

		TimeZone timeZone = TimeZone.getDefault();

		System.out.println("name :" + timeZone.getDisplayName() + "\tid  :" + timeZone.getID());

		TimeZone timeZone2 = TimeZone.getTimeZone("America/Los_Angeles");

		Calendar calendar = Calendar.getInstance(timeZone2);
		System.out.println(new Date());
		System.out.println("\nTime in America/Los_Angeles");
		System.out.println(calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":"
				+ calendar.get(Calendar.SECOND));
		System.out.println("\nDate in America/Los_Angeles");
		System.out.println(calendar.get(Calendar.DATE) + "-" + (calendar.get(Calendar.MONTH) + 1) + "-"
				+ calendar.get(Calendar.YEAR));
		;
	}
}
