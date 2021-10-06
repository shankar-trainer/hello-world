package util;

import java.text.NumberFormat;
import java.util.Locale;

public class LocaleDemo {

	public static void main(String[] args) {
		
		Locale locale=Locale.getDefault();
		
		System.out.println(locale);
		System.out.println(locale.getCountry()+" "+locale.getLanguage());
		
		Locale locale2=new Locale("hi", "in");
		System.out.println(locale2.getCountry()+" "+locale2.getLanguage());
		
		NumberFormat num_format=NumberFormat.getCurrencyInstance(Locale.CHINESE);
			float salary=345000.678f;
		
		
		System.out.println(num_format.format(salary));
	     num_format=NumberFormat.getCurrencyInstance(locale2);
	     System.out.println(num_format.format(salary));
	     
	     num_format=NumberFormat.getCurrencyInstance(Locale.JAPAN);
	     System.out.println(num_format.format(salary));
	     
	     num_format=NumberFormat.getCurrencyInstance(Locale.FRANCE);
	     System.out.println(num_format.format(salary));	
	     
	     num_format=NumberFormat.getCurrencyInstance(Locale.US);
	     System.out.println(num_format.format(salary));	
	     
	     num_format=NumberFormat.getCurrencyInstance(Locale.UK);
	     System.out.println(num_format.format(salary));	
		
	}
}
