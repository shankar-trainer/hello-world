package com.cognizant.thread;

import java.util.Date;

public class Clock {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("clock program");
		
		Date date;
		for(;;)
		{
			date=new Date();
			System.out.println(date.getHours()+":"+date.getMinutes()+":"+date.getSeconds());
		  Thread.sleep(1000);
		}
	}
}
