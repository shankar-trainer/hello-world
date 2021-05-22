package com.cts.date;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DateTimeException;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class DateDemo6 {

	public static void main(String[] args) throws IOException {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("give date in dd-MM -yyyy  format ");
		String s = reader.readLine();

		try {
			TemporalAccessor parse = formatter.parse(s);

			System.out.println(parse);
		}

		catch (DateTimeException e) {
			System.err.println("date not in proper format \n"+e.getMessage());
		}
	}
}
