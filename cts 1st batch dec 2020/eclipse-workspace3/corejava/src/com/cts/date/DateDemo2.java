package com.cts.date;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateDemo2 {

	public static void main(String[] args) {

		LocalDate date=LocalDate.now();
		
		System.out.println(date);
		
		LocalTime localTime=LocalTime.now();
		
		System.out.println(localTime);
		
		
	}
}
