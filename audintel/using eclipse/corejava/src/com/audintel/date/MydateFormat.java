package com.audintel.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MydateFormat {

	public static void main(String[] args) {
		Date date=new Date();
		DateFormat dateFormat=DateFormat.getDateInstance(DateFormat.LONG);
		
		String format = dateFormat.format(date);
		System.out.println("long format "+format);
		
		dateFormat=DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("short format "+dateFormat.format(date));
		
		System.out.println("medium format "+DateFormat.getDateInstance(DateFormat.MEDIUM).format(date));
		
		
		System.out.println("date in custom format ");
		
		DateFormat dateFormat2=new SimpleDateFormat("dd-MM-yyyy");
		
		System.out.println(dateFormat2.format(date));
		System.out.println(new SimpleDateFormat("dd-MMM-yyyy").format(date));
		System.out.println(new SimpleDateFormat("dd-MMMM-yyyy").format(date));
		
		System.out.println(new SimpleDateFormat("dd-MMMM-yyyy G").format(date));
		System.out.println(new SimpleDateFormat("dd-MMMM-yyyy EEE G").format(date));
		System.out.println(new SimpleDateFormat("dd-MMMM-yyyy EEEE G").format(date));
		System.out.println(new SimpleDateFormat("dd-MMMM-yyyy EEEE G hh:mm:ss a").format(date));
		
		
		
		
	}
}
