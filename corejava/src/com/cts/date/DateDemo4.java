package com.cts.date;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DateDemo4 {

	public static void main(String[] args) {

		LocalTime localTime = LocalTime.now();

		LocalTime localTime1 = LocalTime.of(12, 33, 2, 789);

		System.out.println(localTime);
		System.out.println(localTime1);

		LocalTime plusHours = localTime.plusHours(12);

		System.out.println(plusHours);

		long until = localTime1.until(localTime, ChronoUnit.HOURS);

		System.out.println("diff between " + localTime + " and " + localTime1 + " is " + until);

		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println(dateTime);
		
	}
}
