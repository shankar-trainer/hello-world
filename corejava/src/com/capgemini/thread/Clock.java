package com.capgemini.thread;

import java.util.Date;

public class Clock {

	public static void main(String[] args) throws InterruptedException {
		Date date;
		while(true) {
			
			date=new Date();
			System.out.println(date.getHours()+":"+date.getMinutes()+":"+date.getSeconds()             );
			Thread.sleep(1000);
		}
	}
}
