package com.abc.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateFormatProgram2 {

	public static void main(String[] args) {
		Date date = new Date();

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

		System.out.println("enter date in dd-MM-yyyy format");
		String s = sc.next();

		try {
			Date parse = dateFormat.parse(s);
			System.out.println("you have given date in proper format " + s);
			System.out.println("This is date " + parse);
		} catch (ParseException e) {
			System.out.println("date is not given in dd-MM-yyyy format ");
		}

	}
}
