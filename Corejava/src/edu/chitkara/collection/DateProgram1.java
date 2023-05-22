package edu.chitkara.collection;

import java.util.Date;

public class DateProgram1 {

	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date);
		Date date1=new Date(0);
		System.out.println(date1);
		
		Date date2=new Date(1000*60*60l*24*365);
		System.out.println(date2);
	}
}
