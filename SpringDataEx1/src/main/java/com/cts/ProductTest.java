package com.cts;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.cts.model.Product;

class ProductList {
	List<Product> resp;

	public ProductList() {
		resp = new ArrayList<Product>();
	}

	public List<Product> getResp() {
		return resp;
	}

	public void setResp(List<Product> resp) {
		this.resp = resp;
	}
}

public class ProductTest {

	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		
		
//		ResponseEntity<List<Product>> resp=restTemplate.exchange("http://localhost:9090/product/all", 
//				
//			HttpMethod.GET,null,new ParameterizedTypeReference() {
//			});
//		
		
		   ResponseEntity<Product[]> responseEntity = restTemplate.getForEntity("http://localhost:9090/product/all/", Product[].class);
		 Product prd[]=  responseEntity.getBody();
		   
		 for (Product product : prd) {
			System.out.println(product);
		}
		 
		Product p = restTemplate.getForObject("http://localhost:9090/product/search/1002", Product.class);
		System.out.println(p);
		restTemplate.delete("http://localhost:9090/product/delete/1002", Product.class);

	}
}
