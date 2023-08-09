package org.com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;


@SpringBootTest
class RestApplicationTests {

	static Logger logger = LoggerFactory.getLogger(RestApplicationTests.class);

	RestTemplate restTemplate;

	@BeforeEach
	public void setUp() {
		restTemplate = new RestTemplate();
	}

	@Test
	public void searchProductRecord() {
		Product product = restTemplate.getForObject("http://localhost:9090/prd/searchProduct1/1003", Product.class);
		ResponseEntity<Product> product1 = restTemplate.getForEntity("http://localhost:9090/prd/searchProduct1/1003", Product.class);
	
		Assertions.assertNotNull(product);
				
		logger.info("search product works "+	product1.getStatusCode());
	}

	@Test
	public void deleteProductRecord() {
		Product product = new Product();
		product.setPrdId(1002);
		// restTemplate.delete(url, uriVariables);
		
		
		restTemplate.delete("http://localhost:9090/prd/searchProduct1/1003", product);
		// Assertions.assertNotNull(product2);
		logger.info("search product works ");
	}

	@Test
	public void addProductRecord() {
		Product product = new Product();
		product.setPrdId(9005);
		product.setPrdCost(890);
		product.setPrdName("clock");
		try {
			ResponseEntity<Product> postForEntity = restTemplate.postForEntity("http://localhost:9090/prd/addProduct",
					product, Product.class);
			Assertions.assertNotNull(postForEntity);
			// Assertions.assertEquals(HttpStatus.OK, ResponseEntity.status(HttpStatus.OK));

			logger.info("add product works " + postForEntity.getStatusCodeValue());
		} catch (HttpClientErrorException e) {
			// assertEquals(200, e.getRawStatusCode());
			Assertions.fail(e.getMessage());
		}
	}

}
