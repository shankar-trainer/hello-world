package org.cognizant.java8.datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DatePrg1 {

	public static void main(String[] args) {
		/*Date date=new Date();
		System.out.println(date);
		
		date=new Date(1);
		System.out.println(date);
		*/
		
		LocalDate date=LocalDate.now();
		System.out.println(date);
		LocalDate date1=LocalDate.of(2019,12,20);
		System.out.println(date1);
		
		long diff=date1.until(date, ChronoUnit.DAYS);
		System.out.println(diff);
		
		LocalTime localTime=LocalTime.now();
		LocalTime localTime1=LocalTime.of(12, 33, 44);
		
		System.out.println("now time "+localTime);
		System.out.println("new  time "+localTime1);
		
		MonthDay of = MonthDay.of(Month.JULY, 12);
		
		System.out.println("Month day "+of);
		
		Period period=Period.of(2022,10, 12);
		System.out.println(period);
	}
}
