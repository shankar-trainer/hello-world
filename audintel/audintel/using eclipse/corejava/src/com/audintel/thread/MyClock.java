package com.audintel.thread;

import java.time.LocalTime;

public class MyClock {

	public static void main(String[] args) throws InterruptedException {
		LocalTime localTime;
		for(;;) {
			Thread.sleep(1000);
			localTime=LocalTime.now();
			System.out.println(localTime);
			if(localTime.equals(LocalTime.of(17, 12,59)))
			  System.exit(0);
		}
		
	}
}
