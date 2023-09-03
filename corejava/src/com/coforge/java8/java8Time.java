package com.coforge.java8;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class java8Time {

	public static void main(String[] args) {
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		System.out.println(LocalTime.MIDNIGHT);
		System.out.println(LocalTime.NOON);
		System.out.println(LocalTime.MAX);
		System.out.println(LocalTime.MIN);

		System.out.println(LocalTime.of(10, 22, 30, 99));
		System.out.println(LocalTime.of(10, 22, 30, 99).plusHours(20));
		System.out.println(LocalTime.of(10, 22, 30, 99).plusMinutes(500));

		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		System.out.println(LocalDateTime.of(2022, 10, 30, 12, 33, 44));

		
	}
}
