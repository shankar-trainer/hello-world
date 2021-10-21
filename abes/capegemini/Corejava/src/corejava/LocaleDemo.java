package corejava;

import java.util.Locale;

public class LocaleDemo {

	public static void main(String[] args) {
	Locale locale[]=	Locale.getAvailableLocales();
		
	for (Locale locale2 : locale) {
		System.out.println
	(locale2.getCountry()+"   "+locale2.getDisplayCountry()+ "  "+locale2.getDisplayLanguage());
	}
	
	}
}
