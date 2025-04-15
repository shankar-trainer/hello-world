package cts.com.app;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

class PortfolioTest {
	Portfolio portfolio;

	@Mock
	StockService stockService;

	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		portfolio = new Portfolio();
		portfolio.setStockService(stockService);
	}

	@Test
	void testGetMarketValue() {
		List<Stock> stocks = new ArrayList<Stock>();
		Stock stock1 = new Stock("mb10001", "mobile", 10);
		Stock stock2 = new Stock("tv10001", "tv", 20);

		stocks.add(stock1);
		stocks.add(stock2);

		portfolio.setStocks(stocks);
		
		Mockito.when(stockService.getPrice(stock1)).thenReturn(10.0);
		Mockito.when(stockService.getPrice(stock2)).thenReturn(30.0);
		
		
		assertEquals(600.0D, portfolio.getMarketValue());
	}

}
