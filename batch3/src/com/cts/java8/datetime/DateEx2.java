package com.cts.java8.datetime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;

public class DateEx2 {

	public static void main(String[] args) {
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);

		LocalTime localTime1 = LocalTime.MIDNIGHT;
		System.out.println(localTime1);
		
		System.out.println(Duration.between(localTime1, localTime).toHours());
		System.out.println(Duration.between(localTime1, localTime));
		
		

		LocalTime localTime2 = LocalTime.of(12, 34, 55);

		System.out.println(localTime2);

		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm a");
		System.out.println(timeFormatter.format(localTime));
		
		LocalTime plus = localTime.plus(10, ChronoUnit.HOURS);
		LocalTime plus1 = localTime.plusMinutes(10);
		
		localTime.minusHours(10);
		
		
		
		
		

	}
}
