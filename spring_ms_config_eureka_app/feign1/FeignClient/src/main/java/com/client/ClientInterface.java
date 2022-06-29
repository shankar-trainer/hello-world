package com.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(url="http://localhost:8080",name="myapp1")
public interface ClientInterface {

	@GetMapping("/")
	public String getData();
	
}
