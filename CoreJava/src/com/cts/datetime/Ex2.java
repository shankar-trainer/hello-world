package com.cts.datetime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Ex2 {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		LocalDate date2=LocalDate.of(2020, 11, 9);
		
		long until = date2.until(date,ChronoUnit.DAYS);
		System.out.println(until);
		
		System.out.println(date2.until(date,ChronoUnit.MONTHS));
		
		
		Instant instant=Instant.now();
		System.out.println(instant);
		
		Instant instant1=	instant.plus(20, ChronoUnit.DAYS);
		
		Duration between = Duration.between(instant,instant1);
		
		System.out.println(between.toHours());
		System.out.println(between.toDays());
		
	}
}
