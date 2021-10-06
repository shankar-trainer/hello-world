package util;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalDemo2 {

	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();

		
		
		GregorianCalendar 
	//Calendar	
		calendar2=new GregorianCalendar(2022,5,20,10,10,10);
		
		// System.out.println(calendar);
		System.out.println("date is " + calendar2.get(Calendar.DATE) + "-" + (calendar2.get(Calendar.MONTH) + 1) + " "
				+ calendar2.get(Calendar.YEAR));

		System.out.println("time is " + calendar2.get(Calendar.HOUR) + ":" + calendar2.get(Calendar.MINUTE) + ":"
				+ calendar2.get(Calendar.SECOND));
		
		calendar2.set(Calendar.DATE, 30);
		
		calendar2.set(1999,10,30);
		
		System.out.println("date is " + calendar2.get(Calendar.DATE) + "-" + (calendar2.get(Calendar.MONTH) + 1) + " "
				+ calendar2.get(Calendar.YEAR));

		System.out.println("time is " + calendar2.get(Calendar.HOUR) + ":" + calendar2.get(Calendar.MINUTE) + ":"
				+ calendar2.get(Calendar.SECOND));

		
		System.out.println(calendar2.isLeapYear(2020));
	
		
	}
}
