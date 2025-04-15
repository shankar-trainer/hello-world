package com.packt.trading;

import java.math.BigDecimal;

import com.packt.trading.dto.Stock;

public class StockBroker {
	private final static BigDecimal LIMIT = new BigDecimal("0.10");
	public StockBroker(MarketWatcher market) {
		this.market = market;
	}
	
	void perform(Portfolio portfolio,Stock stock) {
		Stock liveStock = market.getQuote(stock.getSymbol());
        BigDecimal avgPrice = portfolio.getAvgPrice(stock);
		BigDecimal priceGained = liveStock.getPrice().subtract(avgPrice);
		BigDecimal percentGain = priceGained.divide(avgPrice);
		if(percentGain.compareTo(LIMIT) > 0) {
			portfolio.sell(stock, 10);
		}else if(percentGain.compareTo(LIMIT) < 0){
			portfolio.buy(stock);
		}
	}
	
	private final MarketWatcher market;
}
