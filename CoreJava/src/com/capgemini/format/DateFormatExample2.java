package com.capgemini.format;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatExample2 {

	public static void main(String[] args) {
		
		Date date=new Date();
		
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(dateFormat.format(date));
		
		 dateFormat=new SimpleDateFormat("dd-MMM-yyyy");
		System.out.println(dateFormat.format(date));
		
		dateFormat=new SimpleDateFormat("dd-MMMMM-yyyy");
		System.out.println(dateFormat.format(date));
		
		dateFormat=new SimpleDateFormat("dd-MMMMM-yyyy  EE");
		System.out.println(dateFormat.format(date));
		
		dateFormat=new SimpleDateFormat("dd-MMMMM-yyyy  EEEEE");
		System.out.println(dateFormat.format(date));
		
		dateFormat=new SimpleDateFormat("dd-MMMMM-yyyy  EEEEE G Z");
		System.out.println(dateFormat.format(date));
		
		dateFormat=new SimpleDateFormat("dd-MMMMM-yyyy  EEEEE G z");
		System.out.println(dateFormat.format(date));
		
		
		dateFormat=new SimpleDateFormat("hh:mm:ss a");
		System.out.println(dateFormat.format(date));
		
		
		
		
	}
}
