package util;

import java.text.DateFormat;
import java.util.Date;

public class DateDemo2 {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);

		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
		String s= dateFormat.format(date);
		System.out.println("Long format " +s);

		dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("Medium format " + dateFormat.format(date));

		dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("short format " + dateFormat.format(date));
		
		dateFormat = DateFormat.getDateInstance();
		System.out.println("default format " + dateFormat.format(date));
	}

}
