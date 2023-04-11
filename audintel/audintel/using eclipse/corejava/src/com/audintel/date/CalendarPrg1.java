package com.audintel.date;

import java.util.Calendar;

public class CalendarPrg1 {

	public static void main(String[] args) {
		
		Calendar calendar=Calendar.getInstance();
		
	System.out.println(calendar.get(Calendar.HOUR)+":"+calendar.get(Calendar.MINUTE)+":"+calendar.get(Calendar.SECOND));
	System.out.println(calendar.get(Calendar.DATE)+"-"+(calendar.get(Calendar.MONTH)+1)+"-"+calendar.get(Calendar.YEAR));
		
		calendar.add(Calendar.MONTH, 3);
	System.out.println(calendar.get(Calendar.DATE)+"-"+(calendar.get(Calendar.MONTH)+1)+"-"+calendar.get(Calendar.YEAR));
		
		calendar.add(Calendar.HOUR, 2);
	System.out.println(calendar.get(Calendar.HOUR)+":"+calendar.get(Calendar.MINUTE)+":"+calendar.get(Calendar.SECOND));
	}
}
