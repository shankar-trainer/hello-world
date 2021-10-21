package com.cts.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateDemo5 {

	public static void main(String[] args) {

		LocalTime localTime = LocalTime.now();

		System.out.println(localTime);

		LocalDate date = LocalDate.now();
		System.out.println(date);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		String format = formatter.format(date);
		System.out.println(format);

		formatter = DateTimeFormatter.ofPattern("EEEE dd-MMMM-yyyy");
		System.out.println(formatter.format(date));
		
	
	}
}
