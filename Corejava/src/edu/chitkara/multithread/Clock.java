package edu.chitkara.multithread;

import java.util.Date;

public class Clock {

	public static void main(String[] args) throws InterruptedException {
		Date date;
		for(;;) {
			date=new Date();
System.out.println(date.getHours()+":"+date.getMinutes()+":"+date.getSeconds());
		Thread.sleep(1000);
		}
	}
}
