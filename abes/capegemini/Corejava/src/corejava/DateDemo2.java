package corejava;

import java.util.Calendar;
import java.util.Date;

public class DateDemo2 {

	public static void main(String[] args) {
	 
		Calendar calendar=Calendar.getInstance();
		calendar.set(2010,5, 12);
		calendar.add(Calendar.HOUR, 5);
	
		
	System.out.println
(calendar.get(Calendar.HOUR)+":"+calendar.get(Calendar.MINUTE)+
		":"+calendar.get(Calendar.SECOND));

	calendar.add(Calendar.YEAR, 5);
	
	System.out.println
	(calendar.get(Calendar.DATE)+"/"+calendar.get(Calendar.MONTH)+
			"/"+calendar.get(Calendar.YEAR));	
	
	//calendar.set(year, month, date);

	}
}
