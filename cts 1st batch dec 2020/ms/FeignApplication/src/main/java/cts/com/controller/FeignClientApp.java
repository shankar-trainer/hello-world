package cts.com.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="client1")

public interface FeignClientApp {
///country/find/feignData/{id}
	
	@GetMapping("country/find/feignData/{id}")
	public String getCountry(@PathVariable(name="id") String id) ;
		
	
}
