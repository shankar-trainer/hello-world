package com.abc.mock.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ICalculatorDaoTest {

	ICalculatorDao dao;

	@BeforeEach
	void setUp() throws Exception {
		dao = Mockito.mock(ICalculatorDao.class);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAdd() {
		dao.add(11, 22);
		
		Mockito.when(dao.add(11, 22)).thenReturn(33);// stubbing 
		Mockito.verify(dao).add(11, 22);
	}

	@Test
	void testSubtract() {
		//fail("Not yet implemented");
	}

}
