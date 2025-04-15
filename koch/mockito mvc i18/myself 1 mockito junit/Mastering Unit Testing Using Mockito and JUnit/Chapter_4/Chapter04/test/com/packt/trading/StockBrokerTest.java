package com.packt.trading;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.argThat;
import static org.mockito.Matchers.eq;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.ArgumentMatcher;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.internal.verification.Times;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import com.packt.trading.dto.Stock;

@RunWith(MockitoJUnitRunner.class)
public class StockBrokerTest {

	@Mock
	MarketWatcher marketWatcher;
	@Mock
	Portfolio portfolio;

	StockBroker broker;
	
	Stock globalStock =  when(Mockito.mock(Stock.class).getPrice()).thenReturn(BigDecimal.ONE).getMock();

	@Before
	public void setUp() {
		broker = new StockBroker(marketWatcher);
	}

	@Test
	public void sanity() throws Exception {
		assertNotNull(marketWatcher);
		assertNotNull(portfolio);
	}

	@Test
	public void marketWatcher_Returns_current_stock_status() throws Exception {
		Stock uvsityCorp = new Stock("UV", "UVSITY Corporation ",
				new BigDecimal(100.00));
		when(marketWatcher.getQuote(anyString())).thenReturn(uvsityCorp);
		assertNotNull(marketWatcher.getQuote("UV"));
	}

	@Test
	public void when_ten_percent_gain_then_the_stock_is_sold() {
		when(portfolio.getAvgPrice(isA(Stock.class))).thenReturn(
				new BigDecimal("10.00"));
		Stock aCorp = new Stock("A", "A Corp", new BigDecimal(11.20));
		when(marketWatcher.getQuote(anyString())).thenReturn(aCorp);
		broker.perform(portfolio, aCorp);
		verify(portfolio).sell(aCorp, 10);
	}

	@Test
	public void verify_zero_interaction() {
		verifyZeroInteractions(marketWatcher, portfolio);
	}

	// This test will fail, this is to demonstrate the error
	@Test
	public void verify_no_more_interaction() {
		Stock noStock = null;
		portfolio.getAvgPrice(noStock);
		portfolio.sell(null, 0);
		verify(portfolio).getAvgPrice(eq(noStock));
		// this will fail as the sell method was invoked
		verifyNoMoreInteractions(portfolio);
	}

	@Test
	public void argument_matcher() {
		when(portfolio.getAvgPrice(isA(Stock.class))).thenReturn(
				new BigDecimal("10.00"));
		Stock blueChipStock = new Stock("FB", "FB Corp",
				new BigDecimal(1000.00));
		Stock otherStock = new Stock("XY", "XY Corp", new BigDecimal(5.00));

		when(marketWatcher.getQuote(argThat(new BlueChipStockMatcher())))
				.thenReturn(blueChipStock);
		when(marketWatcher.getQuote(argThat(new OtherStockMatcher())))
				.thenReturn(otherStock);

		broker.perform(portfolio, blueChipStock);
		verify(portfolio).sell(blueChipStock, 10);

		broker.perform(portfolio, otherStock);
		verify(portfolio, new Times(0)).sell(otherStock, 10);
	}

	@Test(expected = IllegalStateException.class)
	public void throwsException() throws Exception {
		when(portfolio.getAvgPrice(isA(Stock.class))).thenThrow(
				new IllegalStateException("Database down"));

		portfolio.getAvgPrice(new Stock(null, null, null));
		fail("Should throw exception");
	}

	@Test(expected = IllegalStateException.class)
	public void throwsException_void_methods() throws Exception {
		doThrow(new IllegalStateException()).when(portfolio).buy(
				isA(Stock.class));

		portfolio.buy(new Stock(null, null, null));
		fail("Should throw exception");
	}
	
	@Test
	public void consecutive_calls() throws Exception {
		Stock stock = new Stock(null, null, null);
		when(portfolio.getAvgPrice(stock)).thenReturn(
				BigDecimal.TEN, BigDecimal.ZERO);
		assertEquals(BigDecimal.TEN, portfolio.getAvgPrice(stock));
		assertEquals(BigDecimal.ZERO, portfolio.getAvgPrice(stock));
		assertEquals(BigDecimal.ZERO, portfolio.getAvgPrice(stock));
		
	}
	
	Map<String, List<Stock>> stockMap = new HashMap<String, List<Stock>>();
	@Test
	public void answering() throws Exception {
		stockMap.clear();
		doAnswer(new BuyAnswer()).when(portfolio).buy(isA(Stock.class));
		when(portfolio.getCurrentValue()).then(new TotalPriceAnswer());
		
		portfolio.buy(new Stock("A", "A", BigDecimal.TEN));
		portfolio.buy(new Stock("B", "B", BigDecimal.ONE));
		
		assertEquals(new BigDecimal("11"), portfolio.getCurrentValue());
	}

	
	@Test
	public void spying() throws Exception {
		Stock realStock = new Stock("A", "Company A", BigDecimal.ONE);
		Stock spyStock = spy(realStock);
		
        //call real method from  spy
        assertEquals("A", spyStock.getSymbol());
        
        //Changing value using spy
        spyStock.updatePrice(BigDecimal.ZERO);
            
        //verify spy has the changed value
        assertEquals(BigDecimal.ZERO, spyStock.getPrice());
        
        //Stubbing method
        when(spyStock.getPrice()).thenReturn(BigDecimal.TEN);
        
        //Changing value using spy
        spyStock.updatePrice(new BigDecimal("7"));
        
        //Stubbed method value 10.00  is returned NOT 7
        assertNotEquals(new BigDecimal("7") , spyStock.getPrice());
        //Stubbed method value 10.00
        assertEquals(BigDecimal.TEN,  spyStock.getPrice());

	}
	
	//This test will fail
	@Test
	public void doReturn_is_not_type_safe() throws Exception {
		//then return is type safe- It has to return a BigDecimal
		when(portfolio.getCurrentValue()).thenReturn(BigDecimal.ONE);
		//method call works fine
		portfolio.getCurrentValue();
		//returning a String instead of BigDecimal
		doReturn("See returning a String").when(portfolio.getCurrentValue());
		//this call will fail
		portfolio.getCurrentValue();
				
	}
	
	@Test
	public void doReturn_usage() throws Exception {
		List<String> list = new ArrayList<String>();
		List<String> spy = spy(list);
		
		//doReturn fixed the issue
		doReturn("now reachable").when(spy).get(0);
		assertEquals("now reachable", spy.get(0));
	}
	
	@Test
	public void argument_captor() throws Exception {
		when(portfolio.getAvgPrice(isA(Stock.class))).thenReturn(
				new BigDecimal("10.00"));
		Stock aCorp = new Stock("A", "A Corp", new BigDecimal(11.20));
		when(marketWatcher.getQuote(anyString())).thenReturn(aCorp);
		broker.perform(portfolio, aCorp);
		
		ArgumentCaptor<String> arg = ArgumentCaptor.forClass(String.class);
		verify(marketWatcher).getQuote(arg.capture());
		assertEquals("A", arg.getValue());
		
		ArgumentCaptor<Stock> arg0 = ArgumentCaptor.forClass(Stock.class);
		ArgumentCaptor<Integer> arg1 = ArgumentCaptor.forClass(Integer.class);
		verify(portfolio).sell(arg0.capture(), arg1.capture());
		assertEquals("A", arg0.getValue().getSymbol());
		assertEquals(10, arg1.getValue().intValue());
	}
	
	@Test
	public void inorder() throws Exception {
		Stock aCorp = new Stock("A", "A Corp", new BigDecimal(11.20));
		
		portfolio.getAvgPrice(aCorp);
		portfolio.getCurrentValue();
		marketWatcher.getQuote("X");
		portfolio.buy(aCorp);
		
		InOrder inOrder=inOrder(portfolio,marketWatcher);
		inOrder.verify(portfolio).getAvgPrice(isA(Stock.class));
		inOrder.verify(portfolio).getCurrentValue();
		inOrder.verify(marketWatcher).getQuote(anyString());
		inOrder.verify(portfolio).buy(isA(Stock.class));
	}
	
	@Test
	public void changing_default() throws Exception {
		Stock aCorp = new Stock("A", "A Corp", new BigDecimal(11.20));
		Portfolio pf = Mockito.mock(Portfolio.class);
		//default null is returned
		assertNull(pf.getAvgPrice(aCorp));
		
		Portfolio pf1 = Mockito.mock(Portfolio.class, Mockito.RETURNS_SMART_NULLS);
		//a smart null is returned
		System.out.println("#1 "+pf1.getAvgPrice(aCorp));
		assertNotNull(pf1.getAvgPrice(aCorp));
		
		Portfolio pf2 = Mockito.mock(Portfolio.class, Mockito.RETURNS_MOCKS);
		//a smart null is returned
		System.out.println("#2 "+pf2.getAvgPrice(aCorp));
		assertNotNull(pf2.getAvgPrice(aCorp));
		
		Portfolio pf3 = Mockito.mock(Portfolio.class, Mockito.RETURNS_DEEP_STUBS);
		//a smart null is returned
		System.out.println("#3 "+pf3.getAvgPrice(aCorp));
		assertNotNull(pf3.getAvgPrice(aCorp));
	}
	
	@Test
	public void resetMock() throws Exception {
		Stock aCorp = new Stock("A", "A Corp", new BigDecimal(11.20));
		
		Portfolio portfolio = Mockito.mock(Portfolio.class);
		when(portfolio.getAvgPrice(eq(aCorp))).thenReturn(BigDecimal.ONE);
		assertNotNull(portfolio.getAvgPrice(aCorp));
		
		Mockito.reset(portfolio);
		//Resets the stub, so getAvgPrice returns NULL
		assertNull(portfolio.getAvgPrice(aCorp));
	}
	
	@Test
	public void access_global_mock() throws Exception {
		assertEquals(BigDecimal.ONE, globalStock.getPrice());
	}
	
	@Test
	public void mocking_details() throws Exception {
		Portfolio pf1 = Mockito.mock(Portfolio.class, Mockito.RETURNS_MOCKS);
		
		BigDecimal result = pf1.getAvgPrice(globalStock);
		assertNotNull(result);
		assertTrue(Mockito.mockingDetails(pf1).isMock());
		
		Stock myStock = new Stock(null, null, null);
		Stock spy = spy(myStock);
		assertTrue(Mockito.mockingDetails(spy).isSpy());
		
	}
	class BuyAnswer implements Answer<Object>{

		@Override
		public Object answer(InvocationOnMock invocation) throws Throwable {
			Stock newStock = (Stock)invocation.getArguments()[0];
			 List<Stock> stocks = stockMap.get(newStock.getSymbol());
			   if(stocks != null) {
				   stocks.add(newStock);
			   }else {
				   stocks = new ArrayList<Stock>();
				   stocks.add(newStock);
				   stockMap.put(newStock.getSymbol(), stocks);
			   }
			return null;
		}
		
	}
	
	class TotalPriceAnswer implements Answer<BigDecimal>{

		@Override
		public BigDecimal answer(InvocationOnMock invocation) throws Throwable {
			 BigDecimal avgPrice = BigDecimal.ZERO;
			   for(String stockId: stockMap.keySet()) {
				   for(Stock stock:stockMap.get(stockId)) {
					   avgPrice = avgPrice.add(stock.getPrice());
				   }
			   }
			   
			return avgPrice;
		}
		
	}
	class BlueChipStockMatcher extends ArgumentMatcher<String> {
		@Override
		public boolean matches(Object symbol) {
			return "FB".equals(symbol) || "AAPL".equals(symbol);
		}
	}

	class OtherStockMatcher extends BlueChipStockMatcher {
		@Override
		public boolean matches(Object symbol) {
			return !super.matches(symbol);
		}
	}
}
