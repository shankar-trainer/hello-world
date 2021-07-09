package cts.java8.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DatePrg1 {
	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println(date);

		LocalDate date1 = LocalDate.of(2020, 11, 21);
		System.out.println(date1);

		LocalDate plusDays = date.plusDays(100);
		System.out.println(plusDays);

		LocalDate plusDays1 = date.plusWeeks(2);
		LocalDate plusDays2 = date.plusMonths(12);

		LocalDate plus = date.plus(12, ChronoUnit.MONTHS);
		date.minusMonths(10);
		date.minusDays(30);

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(dateTimeFormatter.format(date));

//		dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
//		dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MMMMM-yyyy EEE");
		dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MMMMM-yyyy EEEE");
		System.out.println(dateTimeFormatter.format(date));

	}
}
