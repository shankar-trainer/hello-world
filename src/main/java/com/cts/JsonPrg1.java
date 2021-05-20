//package com.cts.json;
package com.cts;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import com.cts.model.Product;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonPrg1 {
	public static void main(String[] args)
			throws JsonParseException, JsonMappingException, MalformedURLException, IOException {

		ObjectMapper mapper = new ObjectMapper();

		Product readValue = mapper.readValue(new URL("http://localhost:9090/prd/search/99999"),
				Product.class);
		System.out.println(readValue);
		
		List<Product> myObjects = mapper.readValue(new URL("http://localhost:9090/prd/getAll"), new TypeReference<List<Product>>(){});
		
		for (Product product : myObjects) {
			System.out.println(product);
		}

	}
}
