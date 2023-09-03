package com.coforge.java8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class MyDateFormat {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		String format = date.format(dateTimeFormatter);
		System.out.println(format);
		
		System.out.println(date.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy")));
		System.out.println(date.format(DateTimeFormatter.ofPattern("dd-MMMM-yyyy EE")));
		System.out.println(date.format(DateTimeFormatter.ofPattern("dd-MMMM-yyyy EEEE")));
		System.out.println(date.format(DateTimeFormatter.ofPattern("dd-MMMM-yyyy EEEE ")));
		
		LocalTime localTime=LocalTime.now();
		System.out.println(localTime);
		
		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("hh:mm a");
		System.out.println(localTime.format(ofPattern));
		
		String format2 = localTime.format(ofPattern);
		
		LocalTime parse = LocalTime.parse(format2,ofPattern);
		LocalDate date1 = LocalDate.parse(format,dateTimeFormatter);
		
		System.out.println(parse);
		System.out.println(date1);
		
		
		
	}
}
