package cts.thread;

import java.time.LocalTime;

public class Clock {

	public static void main(String[] args) throws InterruptedException {
		
	LocalTime localTime;	
		for(;;) {
			Thread.sleep(1000);
			localTime=LocalTime.now();
			System.out.println(localTime.getHour()+":"+localTime.getMinute()+":"+localTime.getSecond());
		}
		
		
	}
}
