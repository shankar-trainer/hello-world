package com.cts.datetime;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ex1 {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		LocalDate date2=LocalDate.of(2019, 11, 9);
		
		System.out.println(date2);
		
		LocalDate date3 = date2.plusDays(66);
		System.out.println(date3);
		System.out.println(date3.plusYears(3));
		
		
		LocalTime localTime=LocalTime.now();
		System.out.println(localTime);
		
		LocalTime localTime1=LocalTime.of(11, 33,55);
		
		System.out.println(localTime1);
		System.out.println(localTime1.plusHours(20));
		System.out.println(localTime1.plusMinutes(20));
		System.out.println(localTime1.plusMinutes(-20));
		
		
	}
}
