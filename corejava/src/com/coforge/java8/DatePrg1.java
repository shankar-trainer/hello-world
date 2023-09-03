package com.coforge.java8;

import java.util.Date;

public class DatePrg1 {

	
	public static void main(String[] args) {
		Date date=new Date();
		
		System.out.println(date);
		
		Date date1=new Date(1);
		System.out.println(date1);
		
		date1=new Date(60*60*1000L*24*30);
		System.out.println(date1);
		
		
	}
}
