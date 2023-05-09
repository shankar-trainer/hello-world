package com.nec.thread;

import java.time.LocalTime;

public class Clock {

	public static void main(String[] args) throws InterruptedException {
		
		LocalTime localTime;
		
		for(;;) {
		   localTime=LocalTime.now();
		   System.out.println(localTime);
		  Thread.sleep(1000);
		
		}
		
		
	}
}
