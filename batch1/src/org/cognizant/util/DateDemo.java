package org.cognizant.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		Date date2 = new Date(1);

		System.out.println(date);
		System.out.println(date2);

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(sdf.format(date));

		sdf = new SimpleDateFormat("hh:mm:ss");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("dd-MMM-yyyy EEE ");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("dd-MMMMM-yyyy EEEEE a Z");
		System.out.println(sdf.format(date));

	}
}
