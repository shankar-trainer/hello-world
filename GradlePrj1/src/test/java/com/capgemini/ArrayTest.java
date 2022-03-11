package com.capgemini;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;


public class ArrayTest {

	Array array;
	Array array1;
	
	@BeforeEach
	void  init() {
	 array=new Array();	
	 array1=new Array();	
	}
	
	
	//@Test
	@RepeatedTest(5)
	void marksTest()
	{
	 array.setMarks(new int[] {1,2,3,4});
	 array1.setMarks(new int[] {1,2,3,4});
	 
	 int ar1[]= {11,22,33};
	 int ar2[]= {11,22,33};
	 
	 assertArrayEquals(ar1, ar2);
	 assertArrayEquals(array1.getMarks(), array.getMarks());
	 	
	}
	
	@Test
	void Test1() {
    // assertSame(array1, array);
		assertSame("hello","hello");
		//assertSame("hello",new String("hello"));
		assertNotSame("hello", "hello1");
		
	}
}
