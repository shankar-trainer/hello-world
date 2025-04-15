package com.javacodegeeks;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class MyServiceTest {
	
	@Mock private MyDao myDao;
	
	@Rule public MockitoRule rule = MockitoJUnit.rule();
	
	@Test
	public void testFindById() {
		MockitoAnnotations.initMocks(this);
		MyService myService = new MyService(myDao);
		myService.findById(1L);
		Mockito.verify(myDao).findById(1L);
		
	}
	
	@Test
	public void test() {
		MyService myService = new MyService(myDao);
		Mockito.when(myDao.findById(1L)).thenReturn(createTestEntity());
		MyEntity actual = myService.findById(1L);
		Assert.assertEquals("My first name", actual.getFirstName());
		Assert.assertEquals("My surname", actual.getSurname());
		Mockito.verify(myDao).findById(1L);
	}
	
	private MyEntity createTestEntity() {
		MyEntity myEntity = new MyEntity();
		myEntity.setFirstName("My first name");
		myEntity.setSurname("My surname");
		return myEntity;
	}

}
