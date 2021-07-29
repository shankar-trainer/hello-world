package com.montran.assignment.day6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q1 {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd MMMMM yyyy");
		
		String s="7 July 2019";
		Date date1 = dateFormat.parse(s);
		
		if(date1.getDay()==1)
			System.out.println("white");
		
	}
}
