package com.cts.mock.model;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ListTest {

	@Mock
	List<String> cityList;
	
	@BeforeEach
	void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	void test1() {
		cityList.add("chennai");
		when(cityList.get(0)).thenReturn("chennai");
		verify(cityList).add("chennai");
	}
	@Test
	void test2() {
		cityList.add("delhi");
		when(cityList.get(0)).thenReturn("delhi");
		when(cityList.get(1)).thenThrow(new RuntimeException("element not present"));
		verify(cityList).add("delhi");
	}
}
