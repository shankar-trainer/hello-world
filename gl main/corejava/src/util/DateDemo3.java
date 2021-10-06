package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo3 {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);

	  SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy");
	  System.out.println(dateformat.format(date));
	  
	  dateformat=new SimpleDateFormat("dd-MMM-yyyy");
	  System.out.println(dateformat.format(date));
	  
	  dateformat=new SimpleDateFormat("EEEEE dd-MMMMM-yyyy hh:mm:ss:SS a Z G");
	  System.out.println(dateformat.format(date));
	}
}
