package com.cts.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cts.exception.ProductAlreadyPresentException;
import com.cts.model.Product;

@SpringBootTest
class ShoppingKartTest {

	@Autowired
	ShoppingKart dao;
	Product prd;

	@Test
	void testAddProduct() throws ProductAlreadyPresentException {
		prd = new Product();
		prd.setPrdId(9001);
		prd.setPrdName("my book");
		prd.setPrdLocation("noida");
		prd.setPrdCost(899.0f);

		assertEquals(dao.addProduct(prd), prd);

		Exception exception = assertThrows(ProductAlreadyPresentException.class, () -> {
			dao.addProduct(prd);

		});

		assertTrue(exception.getMessage().contains("product already present"));
	}

	@Test
	void testRemoveProduct() throws Exception {
		prd = new Product();
		prd.setPrdId(9001);
		prd.setPrdName("my book");
		prd.setPrdLocation("noida");
		prd.setPrdCost(899.0f);
		dao.addProduct(prd);
		
		assertEquals(dao.removeProduct(prd), prd);

		Exception exception = assertThrows(Exception.class, () -> {
			dao.removeProduct(prd);
		});
		assertTrue(exception.getMessage().contains("remove product not found"));
	}

	@Test
	void testSearchProduct() throws Exception {

		prd = new Product();
		prd.setPrdId(9001);
		prd.setPrdName("my book");
		prd.setPrdLocation("noida");
		prd.setPrdCost(899.0f);
		dao.addProduct(prd);
		
		assertEquals(dao.searchProduct(prd), prd);

		Exception exception = assertThrows(Exception.class, () -> {
			dao.searchProduct(prd);
		});
		
		assertTrue(exception.getMessage().contains("product not found"));
	}

	@Test
	void testUpdateProduct() throws ProductAlreadyPresentException {

		prd = new Product();
		prd.setPrdId(9001);
		prd.setPrdName(" ");
		prd.setPrdLocation(" ");
		prd.setPrdCost(0.0f);
		dao.addProduct(prd);

	
	}

	@Test
	void testGetAllProduct() {
		// fail("Not yet implemented");
	}

}
