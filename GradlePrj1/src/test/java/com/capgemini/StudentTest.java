package com.capgemini;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentTest {

	Student student;
	Student student1;

	@BeforeEach
	void setUp() throws Exception {
	 student=new Student();
	 student1=new Student();
	 
	 student.setRoll(100001);
	 student.setName("ram kumar");
	 student.setEngMarks(78.5f);
	 student.setMathMarks(75.2f);
	 student.setScienceMarks(70.52f);
	 
	 student1.setRoll(100001);
	 student1.setName("ram kumar");
	 student1.setEngMarks(78.5f);
	 student1.setMathMarks(75.2f);
	 student1.setScienceMarks(70.52f);
	}

	@AfterEach
	void tearDown() throws Exception {
	 student=null;
	}
	
	
	@Test
	void testObject()
	{
		assertNotNull(student);
		assertEquals(student, student1);
	}
	
	@Test
   void testRoll() {
      assertEquals(100001,student.getRoll());	   
   }
	@Test
	void testName() {
		assertEquals("ram kumar",student.getName());	   
	}
	
	
	@Test
	void testTotalMarks() {
		assertEquals(224.22f, student.totalMarks());
	}
//
	@Test
	void testAvgMarks() {
		assertEquals(74.74f, student.avgMarks());
	}

}
