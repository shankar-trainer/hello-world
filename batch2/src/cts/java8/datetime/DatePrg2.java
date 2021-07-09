package cts.java8.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DatePrg2 {

	public static void main(String[] args) {
		LocalTime localTime=LocalTime.now();
		System.out.println(localTime);
		
		LocalTime localTime1=LocalTime.of(12,33,44);
		System.out.println(localTime1);
		
		LocalTime plusHours = localTime.plusHours(20);
		System.out.println(plusHours);
		
		plusHours=localTime.plusMinutes(30);
		System.out.println(plusHours);

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm a");
		System.out.println(dateTimeFormatter.format(localTime));
		
		MonthDay day=MonthDay.of(12,30);
		System.out.println(day);
		
		
		Duration duration=Duration.of(12, ChronoUnit.DAYS);
		System.out.println(duration);
		System.out.println("duration  days "+duration.toDays());
		System.out.println("duration hours "+duration.toHours());
		
		LocalDate date1=LocalDate.now();
		LocalDate date2=LocalDate.of(2021,12,12);
		// LocalTime -- duration 
		// LocalDate   -- period 
		
		long days = Duration.between(date2, date1).toDays();
		System.out.println(days);
		
	}
}
