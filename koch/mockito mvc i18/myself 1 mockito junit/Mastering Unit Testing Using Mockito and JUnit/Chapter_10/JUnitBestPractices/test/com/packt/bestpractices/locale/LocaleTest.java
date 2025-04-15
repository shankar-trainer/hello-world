package com.packt.bestpractices.locale;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LocaleTest {
	private Locale defaultLocale;

	@Before
	public void setUp() {
		defaultLocale = Locale.getDefault();
		Locale.setDefault(Locale.GERMANY);
	}

	@After
	public void restore() {
		Locale.setDefault(defaultLocale);
	}

	@Test
	public void currencyRoundsOff() throws Exception {
		assertNotNull("Currency is NULL",CurrencyFormatter.format(100.999));
		assertTrue("Currency is not USD($)",CurrencyFormatter.format(100.999).contains("$"));
		assertEquals("Wrong formatting","$101.00", CurrencyFormatter.format(100.999));
	}
}

class CurrencyFormatter {

	public static String format(double amount) {
		NumberFormat format = NumberFormat.getCurrencyInstance();
		return format.format(amount);
	}
}
