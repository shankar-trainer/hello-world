package com.cts.json;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import com.cts.model.Product;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToProduct {
	public static void main(String[] args)
			throws JsonParseException, JsonMappingException, MalformedURLException, IOException {

		System.out.println(" JSON to Object   Serialisation...\n");

		ObjectMapper mapper = new ObjectMapper();
		Product prd = mapper.readValue(new URL("http://localhost:9090/prd/search/565665"), Product.class);

		System.out.println(prd.getId()+"  "+prd.getName()+"  "+prd.getCost());
		
		System.out.println("list  ...\n");
		List<Product> prdList = mapper.readValue(new URL("http://localhost:9090/prd/getAll"), 
				new TypeReference<List<Product>>() {});
		
		prdList.stream().forEach(a->System.out.println(a.getId()+"  "+a.getName()+"  "+a.getCost()));
		
		System.out.println("object to JSON   ...  de serialisation \n");
		
		Product product1=new Product();
		product1.setId(4444);
		product1.setName("hero bike");
		product1.setCost(70000);
		
		mapper.writeValue(new File("target\\Prd.json"), product1);
		
	}
}
