package com.capgemini.format;

import java.text.NumberFormat;
import java.util.Locale;

public class LocaleCurrency {

	public static void main(String[] args) {

		NumberFormat nformat = NumberFormat.getCurrencyInstance();
		System.out.println(nformat.format(23000));

		nformat = NumberFormat.getCurrencyInstance(Locale.FRENCH);
		System.out.println(nformat.format(23000));
		
		nformat = NumberFormat.getCurrencyInstance(Locale.CHINA);
		System.out.println(nformat.format(23000));
		
		nformat = NumberFormat.getCurrencyInstance(Locale.JAPAN);
		System.out.println(nformat.format(23000));
		
		nformat = NumberFormat.getCurrencyInstance(new Locale("en","in"));
		System.out.println(nformat.format(23000));
		
		nformat = NumberFormat.getCurrencyInstance(new Locale("hi","in"));
		System.out.println(nformat.format(23000));
	}
}
