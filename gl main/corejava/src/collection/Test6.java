package collection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test6 {

	static int validateDate(String s) {
		SimpleDateFormat dateFormat = 
	new SimpleDateFormat("dd/MM/yyyy");
    
		int x=0;
		
		try {
		Date date1=	dateFormat.parse(s);
		//System.out.println(date1);	
		x=1;
		} catch (ParseException e) {
            x=-1;
		}
		return x;
	}

	public static void main(String[] args) {
		String s = "40/01/1999";
		//d [0-9];
		
		System.out.println(s.matches("\\d{2}/\\d{2}/\\d{4}"));
		
		System.out.println(validateDate(s));
	}

}
