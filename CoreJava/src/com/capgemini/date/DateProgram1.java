package com.capgemini.date;

import java.util.Date;

public class DateProgram1 {

	public static void main(String[] args) {
		long l1 = System.currentTimeMillis();

		Date date = new Date();
		System.out.println(date.equals(new Date()));
		System.out.println(date);

		Date date1 = new Date(1);
		System.out.println(date1);

		Date date2 = new Date(1000L * 60 * 60 * 24L * 30);
		System.out.println(date2);

		Date date3 = new Date(1000L * 60 * 60 * 24L * 365l);
		System.out.println(date3);

		System.out.println(date.after(date3));
		System.out.println(date3.before(date));
		System.out.println(date3.after(date));

		System.out.println(date.equals(new Date()));
		System.out.println(date.compareTo(new Date()));
		System.out.println(date3.compareTo(date3));
		System.out.println(date3.compareTo(date1));
		System.out.println(date1.compareTo(date2));

		long l2 = System.currentTimeMillis();
		System.out.println(l2 - l1+" milli second ");

	}
}
