package com.cts.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.cts.entity.Product;
import com.cts.exception.ProductException;
import com.cts.util.DatabaseUtil;

public class ProductDaoTest {
	static Connection con;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		con = DatabaseUtil.myConnection();
		Statement st = con.createStatement();

		st.executeUpdate("delete from product");

		st.executeUpdate("insert into product values(1001,'java book',456)");
		st.executeUpdate("insert into product values(1002,'trouser',506)");
		st.executeUpdate("insert into product values(1003,'shirt',400)");
		st.executeUpdate("insert into product values(1004,'mobile',10000)");
		st.executeUpdate("insert into product values(1005,'laptop',45000)");
	}

	 @InjectMocks
	ProductDaoImpl dao;

	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	 @Test
	void testAddProduct() throws SQLException, ProductException {
		p = null;
		p = new Product();
		p.setPrdId(1006);
		p.setPrdName("pizza");
		p.setPrdCost(678);
		assertTrue(dao.addProduct(p));
		// fail("Not yet implemented");
	}

	Product p, p2 = null;

	@Test
	void testSearchProduct() throws SQLException {
		p = null;
		p = new Product();
		p.setPrdId(1001);

		p2 = new Product();
		p2.setPrdId(1001);
		p2.setPrdName("java book");
		p2.setPrdCost(456);
		 assertEquals(p2, dao.searchProduct(p));
	}

	@Test
	void testGetAllProduct() throws SQLException {
		assertEquals(5, dao.getAllProduct().keySet().size());
		assertNotNull(dao.getAllProduct());
	}

}
