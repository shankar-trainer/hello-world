package com.cts.thread;

import java.time.LocalTime;

public class Clock {

	public static void main(String[] args) throws InterruptedException {
		
		
		LocalTime localTime;
		for(;;) {
			localTime=LocalTime.now();
			Thread.sleep(1000);
			System.out.println(localTime);
		}
	}
}
