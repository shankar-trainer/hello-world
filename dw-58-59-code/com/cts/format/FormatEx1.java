package com.cts.format;

import java.text.DecimalFormat;
import java.util.Currency;
import java.util.Locale;

public class FormatEx1 {

	public static void main(String[] args) {
		int id=1001;
		String name="mohan kumar";
		float salary=90000.677676f;
		
		System.out.println("id is "+id+"\nname is "+name+"\nsalary is "+salary);
		
		System.out.printf("id is %d\nname is %s\nsalary is %f",id,name,salary);
		
		System.out.printf("\nsalary  %f",salary);
		System.out.printf("\nsalary  %.2f",salary);
		System.out.printf("\nsalary  %30.2f",salary);
		
		DecimalFormat decimalFormat=new DecimalFormat("##,###.00");
		System.out.println("\nsalary "+decimalFormat.format(salary));
		
		Currency currency=Currency.getInstance(Locale.getDefault());

		System.out.println(currency.getCurrencyCode());
		System.out.println(currency.getSymbol());
		System.out.println(currency.getDisplayName());

		Locale locale=new Locale("en","IN");
		currency=Currency.getInstance(locale);
		
		System.out.println(currency.getCurrencyCode());
		System.out.println(currency.getSymbol());
		System.out.println(currency.getDisplayName());
	}
}
