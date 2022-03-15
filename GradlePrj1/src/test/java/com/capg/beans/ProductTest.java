package com.capg.beans;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ProductTest {

	@Mock
	Order order;

	@BeforeEach
public	void setUp() {
		// MockitoAnnotations.initMocks(this);
		MockitoAnnotations.openMocks(this);
		order.setOrderId(1);
		order.setOrderName("garments order");
		order.setNoOfProduct(100);
	}

	@Test
public	void test() {
		Product prd = new Product();
		prd.setPrdId(10001);
		prd.setPrdLocation("delhi");
		prd.setPrdName("garments");
		prd.setCost(458);

		prd.setOrder(order);
		
		when(order.getOrderId()).thenReturn(1);
		verify(order).setNoOfProduct(100);
		assertEquals("garments", prd.getPrdName());
	}
}
