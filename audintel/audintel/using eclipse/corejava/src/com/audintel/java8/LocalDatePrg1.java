package com.audintel.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDatePrg1 {
public static void main(String[] args) {
	
	LocalDate date1=LocalDate.now();
	LocalDate date2=LocalDate.of(2001, 12, 2);
	
	System.out.println(date1);
	System.out.println(date2);
	
	date2=date2.plusYears(2);
	date2=date2.plusMonths(3);
	date2=date2.plusDays(455);
	
	System.out.println(date2);//yyyy-MM-dd

	DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	
	System.out.println(ofPattern.format(date2));
	System.out.println(DateTimeFormatter.ofPattern("dd-MMMM-yyyy EEEE G").format(date1));
	
	LocalTime localTime1=LocalTime.now();
	LocalTime localTime2=LocalTime.of(12, 33,55);
	
	System.out.println(localTime1);
	System.out.println(localTime2);
	
	localTime2=	localTime2.plusHours(12);
	localTime2=localTime2.plusMinutes(0);
	localTime2=localTime2.plusNanos(5677);
	localTime2=	localTime2.plusSeconds(12);
	System.out.println(localTime2);
	
	System.out.println(DateTimeFormatter.ofPattern("hh:mm a").format(localTime2));
 
	LocalDateTime dateTime=LocalDateTime.now();
	LocalDateTime dateTime1=LocalDateTime.of(date2, localTime2);
	LocalDateTime dateTime2=LocalDateTime.of(2012,12,23,3,55);
 
	System.out.println(dateTime);
	System.out.println(dateTime1);
	System.out.println(dateTime2);
  }
}
