package com.cts.java8date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DateEx2 {
	public static void main(String[] args) {
		LocalTime localTime = LocalTime.of(10, 30);
		System.out.println(localTime);

		LocalTime localTime2 = LocalTime.of(02, 30, 33, 7677);
		System.out.println(localTime2);

		LocalTime localTime3 = LocalTime.now();
		System.out.println(localTime3);
	
		LocalTime plus = localTime3.plus(12, ChronoUnit.HOURS);
		
		System.out.println(plus);
		LocalTime plusHours = localTime3.plusHours(10);
		System.out.println(plusHours);
		
	}
}
