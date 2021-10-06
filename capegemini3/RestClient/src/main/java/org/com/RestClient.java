package org.com;

import java.util.Arrays;
import java.util.List;

//import org.junit.jupiter.api.Assertions;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

public class RestClient {

	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();

		/*Product product1 = restTemplate.getForObject("http://localhost:9090/prd/searchProduct1/1002", Product.class);
		if (product1 != null)
			System.out.println(
					"found \n" + product1.getPrdId() + " " + product1.getPrdName() + " " + product1.getPrdCost());
	
	 restTemplate.delete("http://localhost:9090/prd/deleteProduct/1002");
	 */
		
	 Product product=new Product();
	 product.setPrdId(1005);
	 product.setPrdCost(400);
	 product.setPrdName("angular book");
	// restTemplate.put("http://localhost:9090/prd/updateProduct", product);
	  
	
	//	try {
			ResponseEntity<Product> postForEntity = restTemplate.postForEntity
					("http://localhost:9090/prd/getProduct",
					product, Product.class);
			if(postForEntity!=null)
				System.out.println("added");
			//Assertions.assertNotNull(postForEntity);
			// Assertions.assertEquals(HttpStatus.OK, ResponseEntity.status(HttpStatus.OK));

		//	logger.info("add product works " + postForEntity.getStatusCodeValue());
		//} catch (HttpClientErrorException e) {
			// assertEquals(200, e.getRawStatusCode());
			//Assertions.fail(e.getMessage());

	 
	}

}
