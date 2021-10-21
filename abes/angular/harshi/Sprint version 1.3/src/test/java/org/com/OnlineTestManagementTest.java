/*package org.com;
import java.time.LocalTime;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

public class OnlineTestManagementTest {

	static Logger logger=LoggerFactory.getLogger(OnlineTestManagementTest.class);
	
	RestTemplate template;
	
	@BeforeEach
	public void setUp()
	{
		template=new RestTemplate();
		
	}
	
	@Test
	public void addTest()
	{
		Test test=new Test();
		test.setTestId(1100);
		test.setTestTitle("Test1");
		test.setTestDuration(LocalTime.parse("1:00"));
		test.setTestTotalMarks(100);
		test.setTestMarksScored(56);
		test.setStartTime(LocalTime.parse("10:00"));
		test.setEndTime(LocalTime.parse("11:00"));
		
		try {
			ResponseEntity<Assessment> postforEntity=template.postForEntity("http://localhost:9090/prd/allTest", test, Assessment.class);
			Assertions.assertNotNull(postforEntity);
			logger.info("Add Test Working..."+postforEntity.getStatusCodeValue());
		}
		catch(HttpClientErrorException e)
		{
			Assertions.fail(e.getMessage());
		}
		
	}
	
	@Test
	public void updateTest()
	{
		
	}
	
	@Test
	public void deleteTest()
	{
		
	}
}
*/