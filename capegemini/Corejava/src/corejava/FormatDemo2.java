package corejava;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class FormatDemo2 {

	public static void main(String[] args) {
		float salary = 767667.67789f;

		Locale locale = Locale.CANADA;

		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);

		System.out.println("Salary in  Canada Currency "
		+numberFormat.format(salary));

		locale = Locale.FRENCH;

		numberFormat = NumberFormat.getCurrencyInstance(locale);
		System.out.println(
				"Salary in  French Currency "+
				numberFormat.format(salary));
		
		numberFormat = NumberFormat.getCurrencyInstance
				(Locale.CHINA);
		System.out.println(
				"Salary in  CHINESE Currency "+
				numberFormat.format(salary));
		
		locale = new Locale("en", "IN");
		numberFormat = NumberFormat.getCurrencyInstance(locale);
		System.out.println(
				"Salary in  Indian Currency "+
				numberFormat.format(salary));
		

	}
}
