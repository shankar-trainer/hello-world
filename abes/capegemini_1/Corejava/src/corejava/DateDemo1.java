package corejava;

import java.util.Date;

public class DateDemo1 {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		System.out.println("time is " + date.getHours() + ":"
				+ date.getMinutes() + ":" + date.getSeconds());

		Date date1 = new Date(1);
		System.out.println(date1);

		long s1 = 365 * 24 * (3600 * 1000L);
		Date date2 = new Date(s1);

		System.out.println(date2);
		long t1 = date.getTime();
		t1 = t1 + s1;
		Date date3 = new Date(t1);
		System.out.println(date3);
		
System.out.println
(date3.getDate()+"/"+date3.getMonth()+"/"+date3.getYear());

		if (date.after(date1)) {
		}
		if (date.before(date1)) {
		}
		if (date.equals(date1)) {
		}

	}
}
