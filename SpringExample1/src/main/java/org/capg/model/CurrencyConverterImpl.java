package org.capg.model;

public class CurrencyConverterImpl implements CurrencyConverter {

	public float convertCurrencytoDollar(Currency currency) {
		return currency.getRupees() / 75;
	}

	public float convertCurrencytoRupees(Currency currency) {
		return currency.getDollar() * 75;
	}

}
