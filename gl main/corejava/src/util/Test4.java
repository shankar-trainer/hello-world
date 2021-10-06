package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Test4 {

	public static void main(String[] args) {
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter date1 in dd-MM-yyyy format ");
		String s=scanner.next();
		
		System.out.println("enter date1 in dd-MM-yyyy format ");
		String s1=scanner.next();
		try {
			Date d1=dateFormat.parse(s);
			Date d2=dateFormat.parse(s1);
			
			long l1=d1.getTime();
			
			long l2=d2.getTime();
			
			System.out.println((l2-l1)/(24*60*60*1000*30L));
			
		} catch (ParseException e) {
		 System.out.println("date not in format dd-MM-yyyy");
		}		
		
	}
	
}
