package com.cts.date;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateDemo7 {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();

		System.out.println(date1);
		LocalDate date2 = LocalDate.of(2011, 11, 23);
		System.out.println(date2);

		LocalDate date3 = date2.plusYears(4).plusMonths(12).plusDays(4);

		System.out.println(date3);

		Instant instant1 = Instant.now();

		System.out.println(instant1);

		Instant instant2 = instant1.plus(12, ChronoUnit.HOURS).plus(30, ChronoUnit.MINUTES);

		long min = Duration.between(instant1, instant2).toMinutes();
		System.out.println(min);
		
		
		Period between = Period.between(date1, date2);
		
		System.out.println(between);
		System.out.println(between.getYears());
		System.out.println(between.getMonths());
		System.out.println(between.getDays());

	}
}
