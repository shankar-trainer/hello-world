package com.capgemini.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDf1 {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
		Date date=new Date();
		
		System.out.println(sdf.format(date));
		
	sdf = new SimpleDateFormat("hh:mm:ss a");
	System.out.println(sdf.format(date));
	// Z    -- timezone 
	// G ERA
	sdf = new SimpleDateFormat("hh:mm:ss   a Z  G");
	System.out.println(sdf.format(date));
		
	}
}
