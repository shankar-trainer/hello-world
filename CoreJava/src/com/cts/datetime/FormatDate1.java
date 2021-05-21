package com.cts.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormatDate1 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);

		System.out.println(LocalTime.now());
		System.out.println(LocalTime.NOON);

		System.out.println(LocalDateTime.now());

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		String s = formatter.format(date);
		System.out.println("date in dd-MM-yyyy " + s);

		formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");

		System.out.println("date in dd-MMM-yyyy " + formatter.format(date));
		System.out.println("date in dd-MMM-yyyy " + DateTimeFormatter.ofPattern("dd-MMMM-yyyy").format(date));
       //E   week day M  -- month 
		System.out.println("date in dd-MMM-yyyy " + DateTimeFormatter.ofPattern("dd-MMMM-yyyy EEEE").format(date));
		
		LocalTime localTime=LocalTime.now();
		System.out.println(localTime);
		System.out.println("time  in hh:mm:ss " + DateTimeFormatter.ofPattern("hh:mm:ss").format(localTime));

	}
}
