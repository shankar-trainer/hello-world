package corejava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest2 {

	public static void main(String[] args) {
		
		Date date=new Date();
		
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(dateFormat.format(date));
		
		dateFormat=new SimpleDateFormat("dd-MMM-yyyy");
		System.out.println(dateFormat.format(date));
		
		dateFormat=new SimpleDateFormat("EEEEE  dd-MMMMM-yyyy");
		System.out.println(dateFormat.format(date));

		dateFormat=new SimpleDateFormat("hh:mm:ss a G");
		System.out.println(dateFormat.format(date));

		dateFormat=new SimpleDateFormat("kk:mm:ss a G");
		System.out.println(dateFormat.format(date));
	
		dateFormat=new SimpleDateFormat("DD  dd-MMM-yyyy");
		System.out.println(dateFormat.format(date));
	
		
		
	}
}
