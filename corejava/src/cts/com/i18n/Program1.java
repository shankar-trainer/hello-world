package cts.com.i18n;

import java.util.Locale;

public class Program1 {

	public static void main(String[] args) {
		
		Locale locale=Locale.getDefault();
		
		System.out.println(locale);
		System.out.println(locale.getCountry());
		System.out.println(locale.getDisplayLanguage());
		
		Locale[] availableLocales = locale.getAvailableLocales();
	
	     for (Locale locale2 : availableLocales) {
			System.out.println(locale2+"  "+locale2.getDisplayCountry()+"  "+locale2.getDisplayLanguage());
		}
	     
	}
	
}
