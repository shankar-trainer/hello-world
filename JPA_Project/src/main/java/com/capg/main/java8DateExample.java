package com.capg.main;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class java8DateExample {

	public static void main(String[] args) {
		
		
		Date date=new Date();
		
		System.out.println(date);// date is both date and time
		date=new Date(1);// date is modifiable/mutable 
		System.out.println(date);
		
		//== java 8 
		
		//LocalDate date1=new LocalDate();// cannot make object of LocalDate// immutable
		
		LocalDate date1=LocalDate.now();//immutable 
		LocalDate date2=LocalDate.of(2021, 10, 20);
		
		System.out.println(date1);
		System.out.println(date2);

		LocalTime time1=LocalTime.now();
		LocalTime time2=LocalTime.of(10,22,33);

		System.out.println(time1);
		System.out.println(time2);

		
	}
}
