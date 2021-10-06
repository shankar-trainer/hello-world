package util;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);

		Date date1 = new Date(1);
		System.out.println(date1);

		Date date2 = new Date(30 * 60 * 60 * 1000 * 24L);
		System.out.println(date2);

		Date date3 = new Date(365 * 60 * 60 * 1000 * 24L);
		System.out.println(date3);

		System.out.println("time is " + date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds());
		System.out.println("date  is " + date.getDate() + "-" + (date.getMonth() + 1) + ":" + (date.getYear() + 1900));

		if (date1.after(date2))
			System.out.println("date1 is after date2");

		if (date1.before(date2))
			System.out.println("date1 is before date2");
		
		if (date1.equals(date2))
			System.out.println("date1 equals date2");

	}

}
