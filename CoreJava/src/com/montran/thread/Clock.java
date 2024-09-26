package com.montran.thread;

import java.util.Date;

public class Clock {

	public static void main(String[] args) throws InterruptedException {
		Date date;
		while(true) {
			Thread.sleep(1000);
			date=new Date();
			System.out.println(date.getHours()+":"+date.getMinutes()+":"+date.getSeconds());
		}
	}
}
