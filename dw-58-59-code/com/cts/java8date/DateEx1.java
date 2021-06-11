package com.cts.java8date;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateEx1 {
	public static void main(String[] args) {
		// LocalDate localDate=new LocalDate();
		LocalDate localDate = LocalDate.of(2001, 11, 25);

		System.out.println(localDate);

		LocalDate localDate2 = LocalDate.now();

		System.out.println(localDate2);

		LocalDate plusDays = localDate2.plusDays(456);
		System.out.println(plusDays);

		long day = localDate.until(plusDays, ChronoUnit.DAYS);
		System.out.println(day);

	}
}
