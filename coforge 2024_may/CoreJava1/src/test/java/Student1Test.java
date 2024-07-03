import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Student1Test {
Student1 student1;
	
	@BeforeEach
	void setUp() throws Exception {
	student1=new Student1(1001, "subham kumar", "delhi");
	}

	@Test
	void testGetStudentId() {
		assertEquals(student1.getStudentId(),1001);
	}

	@Test
	void testGetStudentName() {
		assertEquals(student1.getStudentName(),"subham kumar");
	}

	@Test
	void testGetStudentAddress() {
		assertEquals(student1.getStudentAddress(),"delhi");
	}

	@Test
	void testGetCollegeName() {
		assertEquals(student1.getCollegeName(),"NIT");
	}

}
