package com.cts.java8date;

import java.time.DateTimeException;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class InstanntDemo1 {

	public static void main(String[] args) {
		Instant instant = Instant.now();
		System.out.println(instant);
		Instant instant2 = instant.plus(12, ChronoUnit.HOURS).plus(30, ChronoUnit.MINUTES);

		long min = Duration.between(instant, instant2).toMinutes();

		System.out.println(min);

		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("dd-mm-yyyy");
		try {
			ofPattern.parse("12//10//1999");
		} catch (DateTimeException e) {
			System.out.println("datetime not in format");

		}

	}
}
