package com.capgemini.thread;

import java.util.Date;

public class Clock {

	public static void main(String[] args) throws InterruptedException {

		Date date1;
		for (;;) {
			date1 = new Date();
			System.out.println(date1.getHours() + ":" + date1.getMinutes() + ":" + date1.getSeconds());
		Thread.sleep(1000);
		}
	}
}
