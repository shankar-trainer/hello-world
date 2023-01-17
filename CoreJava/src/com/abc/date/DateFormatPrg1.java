package com.abc.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatPrg1 {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);// date and time both

		System.out.println("only date " + date.getDate() + "/" + date.getMonth() + "/" + date.getYear());
		// getDay -- day in week
		// getMonth -- month 0 to 11
		// getYear -- year as current year -1900
		System.out.println("only date " + date.getDate() + "/" + (date.getMonth() + 1) + "/" + (date.getYear() + 1900));

		System.out.println("only time " + date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds());

		DateFormat dateInstance = DateFormat.getDateInstance(DateFormat.LONG);
		String format1 = dateInstance.format(date);
		System.out.println("long format date "+format1);
		System.out.println("medium format date "+ DateFormat.getDateInstance(DateFormat.MEDIUM).format(date));
		System.out.println("short format date "+ DateFormat.getDateInstance(DateFormat.SHORT).format(date));
		
		
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(dateFormat.format(date));
		System.out.println(new SimpleDateFormat("dd-MMM-yyyy").format(date));
		System.out.println(new SimpleDateFormat("dd-MMMMM-yyyy").format(date));
		System.out.println(new SimpleDateFormat("dd-MMMMM-yyyy E").format(date));
		System.out.println(new SimpleDateFormat("dd-MMMMM-yyyy EEEE").format(date));
		System.out.println(new SimpleDateFormat("dd-MMMMM-yyyy EEEE hh:mm:ss a").format(date));
		System.out.println(new SimpleDateFormat("dd-MMMMM-yyyy EEEE hh:mm:ss a G Z").format(date));
		System.out.println(new SimpleDateFormat("hh:mm:ss a").format(date));
		
		

	}
}
