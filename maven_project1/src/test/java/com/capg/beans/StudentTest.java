package com.capg.beans;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capg.beans.Student;

class StudentTest {

	Student student;
	
	@BeforeEach
	void setUp() throws Exception {
	 student=new Student();
	 student.setRoll(1001);
	 student.setName("ram kumar");
	 student.setMarks(67.8f);
	 }

	@AfterEach
	void tearDown() throws Exception {
	 student=null;
	}

	@Test
	void testStudent() {
        assertNotNull(student);
	}
	@Test
	void testRoll() {
		assertEquals(1001,student.getRoll());
	}
	@Test
	void testMarks() {
		assertTrue(student.getMarks()>=0);
		assertEquals(67.8f,student.getMarks());
	}
	@Test
	void testName() {
		assertNotNull(student.getName());
		assertEquals("ram kumar",student.getName());
		assertTrue(student.getName().length()>=5);
	}
	
	

}
