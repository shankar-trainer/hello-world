package com.cts.date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DateDemo3 {

	public static void main(String[] args) {

		LocalDate date1 = LocalDate.now();

		System.out.println(date1);
		LocalDate date2 = LocalDate.of(2011, 11, 23);
		System.out.println(date2);

		LocalDate date3 = date2.plusYears(4);
		LocalDate date4 = date3.plusMonths(3);

		System.out.println(date4);

		long days = date2.until(date1, ChronoUnit.DAYS);
		long years = date2.until(date1, ChronoUnit.YEARS);

		System.out.println("days between " + date1 + " and " + date2 + " is " + days);
		System.out.println("years between " + date1 + " and " + date2 + " is " + years);

	}
}
