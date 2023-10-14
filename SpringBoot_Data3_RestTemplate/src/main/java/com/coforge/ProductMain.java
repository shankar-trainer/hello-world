package com.coforge;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.coforge.model.Product;

public class ProductMain {

	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		try {
			Product forObject = restTemplate.getForObject("http://localhost:8080/find/100021", Product.class);

			System.out.println(forObject);
		} catch (org.springframework.web.client.HttpClientErrorException e) {
			System.err.println(e.getMessage());
		}
		try {
			Product forObject = restTemplate.getForObject("http://localhost:8080/find/10002", Product.class);

			System.out.println(forObject);
		} catch (org.springframework.web.client.HttpClientErrorException e) {
			System.err.println(e.getMessage());
		}

		System.out.println("all product list ");

		ResponseEntity<List<Product>> responseEntity = restTemplate.exchange("http://localhost:8080/all",
				HttpMethod.GET, null, new ParameterizedTypeReference<List<Product>>() {
				});
		List<Product> body = responseEntity.getBody();

		for (Product product : body) {
			System.out.println(product);
		}

	}
}
