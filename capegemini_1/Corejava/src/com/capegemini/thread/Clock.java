package com.capegemini.thread;

import java.util.Date;

public class Clock {

	public static void main(String[] args) throws InterruptedException {
		Date date=null;
		
		for (long i = 0; i <=100000000; i++) {
			date=new Date();
			Thread.sleep(1000);
System.out.println(date.getHours()+":"+date.getMinutes()+":"+date.getSeconds());
		}
		
		
	}
}
