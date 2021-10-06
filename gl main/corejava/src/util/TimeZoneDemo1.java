package util;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class TimeZoneDemo1 {

	public static void main(String[] args) {
		TimeZone timeZone=TimeZone.getDefault();
		
		System.out.println(timeZone);
		System.out.println("time zone name  is "+timeZone.getDisplayName()+" -- id is "+timeZone.getID());
		
		String timeZone1[]=TimeZone.getAvailableIDs();
		
		for (String timeZone2 : timeZone1) {
			System.out.println(timeZone2);
		}
		
		
		TimeZone timeZone2=TimeZone.getTimeZone("America/Los_Angeles");
		
		GregorianCalendar calendar=new GregorianCalendar(timeZone2);
		
		System.out.println("date is " + calendar.get(Calendar.DATE) + "-" + (calendar.get(Calendar.MONTH) + 1) + " "
				+ calendar.get(Calendar.YEAR));

		System.out.println("time is " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":"
				+ calendar.get(Calendar.SECOND));
		
		
		System.out.println(timeZone2.getID()+" "+timeZone2.getDisplayName());
		
		
	}
}
