package com.cts.date;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		Date date=new Date();
		
		System.out.println(date);
		
		date=new Date(1000l*365l*12l);
		System.out.println(date);
		
	}
}
