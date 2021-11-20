package com.capgemini.format;

import java.util.Locale;

public class LocaleExample {

	public static void main(String[] args) {
		Locale locale=Locale.getDefault();
		
		System.out.println(locale.getCountry());
		System.out.println(locale.getDisplayCountry());
		System.out.println(locale.getDisplayLanguage());
		
		Locale[] availableLocales = Locale.getAvailableLocales();
		
		for (Locale locale2 : availableLocales) {
		System.out.println(locale2.getCountry()+"  "+locale2.getDisplayLanguage()+"  "+locale2.getDisplayName());	
		}
		
		
	}
}
