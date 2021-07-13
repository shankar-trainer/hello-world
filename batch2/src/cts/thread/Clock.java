package cts.thread;

import java.time.LocalTime;

public class Clock {

	public static void main(String[] args) throws InterruptedException {
		LocalTime localTime;
		
		while(true) {
			localTime=LocalTime.now();
			System.out.println(localTime);
			Thread.sleep(1000);
		}
	}
}
