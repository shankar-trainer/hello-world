package com.packt.trading.dto;

import java.math.BigDecimal;

public class Stock {
	private final String symbol;
	private final String name;
	private BigDecimal price;

	public Stock(String id, String name, BigDecimal price) {
		this.symbol = id;
		this.name = name;
		this.price = price;
	}

	public String getSymbol() {
		return symbol;
	}

	public String getName() {
		return name;
	}

	public BigDecimal getPrice() {
		return price;
	}
	
	public void updatePrice(BigDecimal newPrice) {
		this.price = newPrice;
	}
}
