package com.capgemini.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateUserInput {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter time in hh:mm:ss");

		String s = sc.next();

		try {
			Date parse = sdf.parse(s);
			System.out.println(s + "  " + parse);
		} catch (ParseException e) {
			System.err.println("time not in format hh:mm:ss");
		}
		sc.close();
	}
}
