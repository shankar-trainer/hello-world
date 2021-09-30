package com.capgemini.date;

import java.util.Calendar;

public class CalendarPrg1 {

	public static void main(String[] args) {
		
		Calendar cal=Calendar.getInstance();
		System.out.println(cal.get(Calendar.DATE)+"/"+(cal.get(Calendar.MONTH)+1)+"/"+cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.HOUR)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND));
		
		cal.add(Calendar.HOUR, 10);
		
		
		System.out.println("time "+cal.get(Calendar.HOUR)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND));
		
		cal.add(Calendar.DATE, 10);
		
		System.out.println(cal.get(Calendar.DATE)+"/"+(cal.get(Calendar.MONTH)+1)+"/"+cal.get(Calendar.YEAR));
		
	}
}
