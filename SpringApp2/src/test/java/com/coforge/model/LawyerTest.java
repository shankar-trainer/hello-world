package com.coforge.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class LawyerTest {

	ApplicationContext ctx;
	@BeforeEach
	void setUp() throws Exception {
	ctx= new ClassPathXmlApplicationContext("beans.xml");
	}

	@AfterEach
	void tearDown() throws Exception {
	ctx=null;
	}

	@Test
	void test() {
	
		Lawyer bean = ctx.getBean("lawyer1", Lawyer.class);
		assertNotNull(bean, "bean is null");
	
		assertEquals(bean.getId(), 98998);
		assertEquals(bean.getName(), "suresh kumar");
		assertEquals(bean.getSalary(), 90000);
	}

}
