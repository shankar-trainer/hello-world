package com.cognizant.date;

import java.util.Calendar;

public class CalendarApp1 {

	
	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		
	System.out.println(calendar.get(Calendar.DATE)+"/"+(calendar.get(Calendar.MONTH)+1)+"/"+calendar.get(Calendar.YEAR));
	System.out.println(calendar.get(Calendar.HOUR)+":"+(calendar.get(Calendar.MINUTE)+":"+calendar.get(Calendar.SECOND)));
		
	calendar.add(Calendar.HOUR, 10);
	System.out.println(calendar.get(Calendar.HOUR)+":"+(calendar.get(Calendar.MINUTE)+":"+calendar.get(Calendar.SECOND)));

	calendar.add(Calendar.MONTH, 5);
	System.out.println(calendar.get(Calendar.DATE)+"/"+(calendar.get(Calendar.MONTH)+1)+"/"+calendar.get(Calendar.YEAR));
	
	
	
	}
}
