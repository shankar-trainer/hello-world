package com.cts.thread;

import java.time.LocalTime;

public class Clock {

	public static void main(String[] args) throws InterruptedException {
		LocalTime localTime;
		
		while(true) {
			Thread.sleep(1000);
			localTime=LocalTime.now();
			System.out.println(localTime);
		}
	}
}
