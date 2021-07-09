package com.cts.java8.datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateEx1 {

	public static void main(String[] args) {

		// LocalDate date=new LocalDate();
		LocalDate date = LocalDate.now();
		System.out.println(date);

		LocalDate date1 = LocalDate.of(2019, 12, 12);
		System.out.println(date1);

		System.out.println("period in months " + Period.between(date1, date).getMonths());
		System.out.println("period in days " + Period.between(date1, date).getDays());
		System.out.println("period in years " + Period.between(date1, date).getYears());

		System.out.println("period  " + Period.between(date1, date));

		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(timeFormatter.format(date));

		timeFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		System.out.println(timeFormatter.format(date));

		timeFormatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
		System.out.println(timeFormatter.format(date));
		
		timeFormatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy EEEE");
		System.out.println(timeFormatter.format(date));
		
		LocalDate plusDays = date.plusDays(10);

		plusDays = date.plusMonths(20);
		plusDays = date.plusYears(10);

		System.out.println(plusDays);

		date1 = date1.minusMonths(10);
		date1 = date1.minusYears(2);
		date1 = date1.minusYears(4);

	}
}
