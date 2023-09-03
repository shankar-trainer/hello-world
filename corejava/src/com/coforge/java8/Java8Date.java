package com.coforge.java8;

import java.time.LocalDate;

public class Java8Date {

	public static void main(String[] args) {
		//LocalDate date=new LocalDate(); // it is immutable 
	
		LocalDate date=LocalDate.of(2022, 10, 28);
		System.out.println(date);
		
		LocalDate date1=LocalDate.now();
		System.out.println(date1);
		
		LocalDate plusDays = date1.plusDays(10);
		System.out.println(plusDays);
		
		System.out.println(date1.plusMonths(10));
		System.out.println(date1.plusYears(5));
		
		LocalDate plusMonths = date1.plusMonths(10);
		System.out.println(plusMonths);
		plusMonths=plusMonths.plusYears(3);
		System.out.println(plusMonths);
		plusMonths=plusMonths.plusDays(540);
		System.out.println(plusMonths);
		
		
	 
	}
}
