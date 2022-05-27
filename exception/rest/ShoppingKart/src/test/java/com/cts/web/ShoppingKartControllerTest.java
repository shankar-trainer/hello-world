package com.cts.web;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cts.dao.ShoppingKart;
import com.cts.model.Product;

@SpringBootTest
public class ShoppingKartControllerTest {

	@Autowired
	ShoppingKart dao;

	Product prd;

	@Test
	public void addProductTest() {
		prd = new Product();
		prd.setPrdId(9001);
		prd.setPrdName("my book");
		prd.setPrdLocation("noida");
		prd.setPrdCost(899.0f);

		//assertEquals(dao.addProduct(prd), prd);
	}

}
