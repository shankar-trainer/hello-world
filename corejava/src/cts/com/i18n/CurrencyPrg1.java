package cts.com.i18n;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class CurrencyPrg1 {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	public static void main(String[] args) {

		Currency currency = Currency.getInstance(Locale.getDefault());

		System.out.println(currency);

		Currency currency1 = Currency.getInstance(Locale.CANADA);

		System.out.println(currency1.getCurrencyCode()+" --  "+currency1.getSymbol());

		System.out.println(currency1.getCurrencyCode());
		System.out.println(currency1.getSymbol());

		currency1 = Currency.getInstance(new Locale("en", "IN"));
		System.out.println(currency1);

		
		NumberFormat format = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));

		float salary = 65565665.7676f;

		NumberFormat format1 = NumberFormat.getCurrencyInstance();

		System.out.println(format1.format(salary));
		System.out.println(format.format(salary));

		
		format = NumberFormat.getCurrencyInstance(new Locale("en", "CH"));
		
		format.setMaximumFractionDigits(4);
		
		System.out.println(format.format(salary));

	}
}
