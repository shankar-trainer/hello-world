package corejava;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateDemo3 {

	public static void main(String[] args) {
	 
  GregorianCalendar calendar=new GregorianCalendar
		  (2050, 1, 12, 11, 44, 55);
  
  System.out.println(calendar.isLeapYear(2020));
  
  System.out.println(calendar.get(Calendar.ERA));
  

	}
}
