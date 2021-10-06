package util;

import java.util.Calendar;
import java.util.Date;

public class CalDemo {

	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();

		// System.out.println(calendar);
		System.out.println("date is " + calendar.get(Calendar.DATE) + "-" + (calendar.get(Calendar.MONTH) + 1) + " "
				+ calendar.get(Calendar.YEAR));

		System.out.println("time is " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + "-"
				+ calendar.get(Calendar.SECOND));

		// calendar.add(Calendar.HOUR,20);
		calendar.add(Calendar.MONTH, -2);

		System.out.println("time is " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + "-"
				+ calendar.get(Calendar.SECOND));

		System.out.println("date is " + calendar.get(Calendar.DATE) + "-" + (calendar.get(Calendar.MONTH) + 1) + " "
				+ calendar.get(Calendar.YEAR));

		Date date2 = calendar.getTime();

	}
}
