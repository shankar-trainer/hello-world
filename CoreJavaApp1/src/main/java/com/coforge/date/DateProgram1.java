package com.coforge.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateProgram1 {

	public static void main(String[] args) {

		// LocalDate date=new LocalDate();// error LocalDate is immutable

		LocalDate date = LocalDate.now();
		System.out.println(date);

		LocalDate date1 = LocalDate.of(2022, 12, 30);
		System.out.println(date1);
		
		LocalTime localTime=LocalTime.now();
		System.out.println(localTime);
		System.out.println(LocalTime.NOON);
		System.out.println(LocalTime.MIDNIGHT);
		System.out.println(LocalTime.MIN);
		System.out.println(LocalTime.MAX);
		
		LocalTime localTime2=LocalTime.of(10, 20,34);
		System.out.println(localTime2);
		
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println(dateTime);
		
		

	}
}
