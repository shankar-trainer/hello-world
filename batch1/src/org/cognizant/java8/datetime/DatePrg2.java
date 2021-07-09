package org.cognizant.java8.datetime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DatePrg2 {
	public static void main(String[] args) {
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		LocalTime time1 = localTime.plusHours(10);
		LocalTime time2 = localTime.plusMinutes(20);
		LocalTime time3 = localTime.plusSeconds(300);
		System.out.println(time1);
		System.out.println(time2);
		System.out.println(time3);

		localTime.plus(24, ChronoUnit.HOURS);

		System.out.println(Duration.between(localTime, time1));
		Duration duration = Duration.between(localTime, time1);

		System.out.println(duration.toHours());

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm");

		String s = formatter.format(localTime);
		System.out.println("time is " + s);

	}
}
