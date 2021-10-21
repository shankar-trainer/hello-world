package com.capegemini.java8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateDemo1 {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.of(2019, 12, 10);
		System.out.println(localDate);

		LocalDate localDate1 = LocalDate.now();

		System.out.println("current date " + localDate1);

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EEE dd-MMM-yyyy");

		System.out.println(dateTimeFormatter.format(localDate1));

		LocalTime localTime = LocalTime.NOON;
		System.out.println("noon time " + localTime);

		LocalTime localTime1 = LocalTime.MIDNIGHT;
		System.out.println("midnight time " + localTime1);

		LocalTime localTime2 = LocalTime.now();
		System.out.println("current time " + localTime2);

		dateTimeFormatter = DateTimeFormatter.ofPattern
			("hh:mm:ss .SSS a");

		System.out.println
("current time " + dateTimeFormatter.format(localTime2));

	}
}
