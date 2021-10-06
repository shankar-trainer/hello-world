package org.com.onlinetest;



import org.com.onlinetest.model.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class TestAppApplicationTests {
	
	static Logger logger = LoggerFactory.getLogger(TestAppApplicationTests.class);
	
	   RestTemplate template;
		
		@BeforeEach
		public void setUp() {
			template = new RestTemplate();
		}
		
	/*@Test
	public void addStudent() {
		Student student= new Student();
		student.setStudentName("rakesh");
		student.setStudentPassword("gwhgdhg");
		try {
			ResponseEntity<Student> postForEntity=template.postForEntity("http://localhost:7070/Student/addStudent",
					student, Student.class);
			Assertions.assertNotNull(postForEntity);
			
			logger.info("add student works "+postForEntity.getStatusCodeValue());
			
		}
		catch(HttpClientErrorException e) {
			Assertions.fail(e.getMessage());
		}
	}*/
}
