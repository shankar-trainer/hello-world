package com.cognizant.format;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class FormatExample3 {

	public static void main(String[] args) {
		float salary = 767676.77676f;

		NumberFormat numberFormat = NumberFormat.getInstance();
		System.out.println(numberFormat.format(salary));

		NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(currencyInstance.format(salary));

		currencyInstance = NumberFormat.getCurrencyInstance(Locale.FRENCH);
		System.out.println(currencyInstance.format(salary));

		currencyInstance = NumberFormat.getCurrencyInstance(Locale.CHINA);
		System.out.println(currencyInstance.format(salary));

		currencyInstance = NumberFormat.getCurrencyInstance(Locale.JAPAN);
		System.out.println(currencyInstance.format(salary));

		currencyInstance = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
		System.out.println(currencyInstance.format(salary));

	}
}
