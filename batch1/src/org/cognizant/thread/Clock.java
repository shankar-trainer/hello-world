package org.cognizant.thread;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Clock {

	public static void main(String[] args) throws InterruptedException {

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss");

		LocalTime localTime;
		while (true) {
			Thread.sleep(1000);
			localTime = LocalTime.now();
			System.out.println(dateTimeFormatter.format(localTime));
		}

	}
}
