package org.com;

import org.com.model.CardDetails;
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
class SpringAddMoneyWalletDemoApplicationTests {

//	@Test
//	void contextLoads() {
//	}

static	Logger logger  = LoggerFactory.getLogger(SpringAddMoneyWalletDemoApplicationTests.class);
	
	RestTemplate restTemplate;
	
	@BeforeEach
	public void setUp()
	{
	
		restTemplate  = new RestTemplate();
	
	}
	
	@Test
	public void searchProductRecord()
	{
		
	CardDetails cardDetails = restTemplate.getForObject("http://localhost:9090/wallet/cardDetails/7741", CardDetails.class);

	Assertions.assertNotNull(cardDetails);
	
	}
	
//	@Test
//	public void addMoney()
//	{
//		
//		
//		try
//		{
//		ResponseEntity<Product> postForEntity = restTemplate.postForEntity("http://localhost:9090/wallet/addMoney",CardDetails.class);
//	    Assertions.assertNotNull(postForEntity);
//	    
//	   //.assertEquals(HttpStatus.OK,ResponseEntity.status(HttpStatus.OK));
//	    
//	    logger.info("Add product works");
//		}
//		catch (HttpClientErrorException e) {
//			// TODO: handle exception
//			
//			Assertions.fail(e.getMessage());
//		}
	
}
