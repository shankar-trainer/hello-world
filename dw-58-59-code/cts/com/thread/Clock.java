package cts.com.thread;

import java.time.LocalTime;

public class Clock {

	public static void main(String[] args) throws InterruptedException {
		
		LocalTime localTime;
		
		while(true) {
			localTime=LocalTime.now();
			Thread.sleep(1000);
			System.out.println(localTime);
		}
	}
}
