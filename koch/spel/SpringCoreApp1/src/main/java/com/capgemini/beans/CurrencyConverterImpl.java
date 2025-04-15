package com.capgemini.beans;

public class CurrencyConverterImpl implements CurrencyConverter{

	private float amount;
	private float exchangeRate;
	
	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public float getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(float exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public float convertRsToDollar() {
		return (amount/70)+getExchangeRate();
	}

}
