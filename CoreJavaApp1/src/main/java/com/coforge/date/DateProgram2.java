package com.coforge.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateProgram2 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		LocalDate plusYears = date.plusYears(2);
		
		System.out.println(plusYears);
		System.out.println(date.plusMonths(12));
		System.out.println(date.plusWeeks(4));
		
		System.out.println(date);
		
		System.out.println(date.minusMonths(12));
		System.out.println(date.minusYears(4));
		System.out.println(date.minusDays(12));
		
		System.out.println(date);
		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.
				ofPattern("dd-MM-yyyy");
		
		String format = date.format(dateTimeFormatter);
		
		System.out.println("date in dd-MM-yyyy format "+format);
		
		dateTimeFormatter=DateTimeFormatter.
				ofPattern("dd-MMM-yyyy EEE");
		
		System.out.println(date.format(dateTimeFormatter));
		
		
		
	}
}
