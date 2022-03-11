package com.capgemini;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentTest {

	Student student;
	@BeforeEach
	void setUp() throws Exception {
	 student=new Student();
	 student.setRoll(100001);
	 student.setName("ram kumar");
	 student.setEngMarks(78.5f);
	 student.setMathMarks(75.2f);
	 student.setScienceMarks(70.52f);
	}

	@AfterEach
	void tearDown() throws Exception {
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
