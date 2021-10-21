package com.cts;

import org.cts.bean.FactorialTest;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

import com.cts.dao.ProductDaoTest;

@RunWith(JUnitPlatform.class)
//@SelectClasses(FactorialTest.class)
	@SelectClasses({ FactorialTest.class, ProductDaoTest.class })
public class ProductTestSuite {

}
