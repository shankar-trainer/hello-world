package corejava;

import java.text.DateFormat;
import java.util.Date;

public class DateTest1 {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);

		DateFormat dateFormat = DateFormat.getDateInstance
				(DateFormat.LONG);
		String s = dateFormat.format(date);
		System.out.println("Date in long format " + s);

		dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
System.out.println("Date in short format  " + dateFormat.format(date));

dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
System.out.println("Date in full format  " + dateFormat.format(date));
	
	}

}
