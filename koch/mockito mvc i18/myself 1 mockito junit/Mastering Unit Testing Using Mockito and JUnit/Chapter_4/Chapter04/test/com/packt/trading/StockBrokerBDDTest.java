package com.packt.trading;

import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.eq;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.verify;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.packt.trading.dto.Stock;

@RunWith(MockitoJUnitRunner.class)
public class StockBrokerBDDTest {
	@Mock MarketWatcher marketWatcher;
	@Mock Portfolio portfolio;

	StockBroker broker;

	@Before public void setUp() {
		broker = new StockBroker(marketWatcher);
	}
	
	@Test
	public void should_sell_a_stock_when_price_increases_by_ten_percent() throws Exception {
		Stock aCorp = new Stock("FB", "FaceBook", new BigDecimal(11.20));
		//Given a customer previously bought ‘FB’ stocks at $10.00/per share
		given(portfolio.getAvgPrice(isA(Stock.class))).willReturn(
				new BigDecimal("10.00"));
		given(marketWatcher.getQuote(eq("FB"))).willReturn(
				aCorp);
		
		//when the ‘FB’ stock price becomes $11.00
		broker.perform(portfolio, aCorp);
		
		//then the ‘FB’ stocks  are sold
		verify(portfolio).sell(aCorp,10);
	}
}
