package corejava;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateTest3 {

	public static void main(String[] args) {

		Date date = new Date();
		TimeZone timeZone = TimeZone.getDefault();

		System.out.println(timeZone.getID() + "  " + timeZone.getDisplayName());

	TimeZone timeZone2=	TimeZone.getTimeZone("America/Los_Angeles");

	Calendar calendar=Calendar.getInstance(timeZone2);
	
	System.out.println
	(calendar.get(Calendar.HOUR)+":"+calendar.get(Calendar.MINUTE));
 	
		/*String id[] = TimeZone.getAvailableIDs();
		for (String string : id) {
			System.out.println(string);
		}*/

	}
}
