package com.capgemini.format;

import java.util.Date;
import java.util.TimeZone;

public class TimeZoneExample {

	public static void main(String[] args) {
		TimeZone timeZone = TimeZone.getDefault();

		System.out.println(timeZone.getID() + "  " + timeZone.getDisplayName() + "  ");

		TimeZone timeZone1 = TimeZone.getTimeZone("America/Los_Angeles");

		System.out.println(timeZone1.getID() + "  " + timeZone1.getDisplayName() + "  ");

		String[] availableIDs = TimeZone.getAvailableIDs();
		for (String string : availableIDs) {
			System.out.println(string);
		}

	}
}
