package com.cts.format;

import java.text.NumberFormat;
import java.util.Locale;

public class LocaleDemo {

	public static void main(String[] args) {
		
		Locale locale=Locale.FRENCH;
		
		float salary=20767567.6576776f;
		
		NumberFormat numberFormat=NumberFormat.getCurrencyInstance();
		
		System.out.println(numberFormat.format(salary));
		
		numberFormat=NumberFormat.getCurrencyInstance(locale);
		System.out.println(numberFormat.format(salary));
		
		numberFormat=NumberFormat.getCurrencyInstance(Locale.JAPAN);
		System.out.println(numberFormat.format(salary));
		
		Locale locale2=new Locale("en", "IN");
		
		numberFormat=NumberFormat.getCurrencyInstance(locale2);
		System.out.println(numberFormat.format(salary));
		
	}
}
