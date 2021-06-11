package com.cts.date;

import java.util.Date;

public class Date4Ex1 {

	public static void main(String[] args) {
		Date date1=new Date();
		System.out.println(date1);
		
		Date date2=new Date(1);
		System.out.println(date2);
		
		Date date3=new Date(24*60*60*1000*365L);
		System.out.println(date3);
		
		date1=new Date(2030-1900,11,22);
		System.out.println(date1);
		
		if(date1.after(date2))
			System.out.println("date1 after date2");
		
		System.out.println(date1.compareTo(date3));
	}
}
