package com.capgemini.date;

import java.util.Calendar;
import java.util.Date;

public class DateProgram2 {

	public static void main(String[] args) {
		
		Date date=new Date();
		
		System.out.println(date);
		System.out.println(date.getDate()+"-"+date.getMonth()+"-"+date.getYear());
		System.out.println(date.getDate()+"-"+(date.getMonth()+1)+"-"+(date.getYear()+1900));
		System.out.println("day in a week "+date.getDay());
		
		
		System.out.println(date.getHours()+":"+date.getMinutes()+":"+date.getSeconds());
	}
}
