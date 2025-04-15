package com.example.web;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	Logger logger=LoggerFactory.getLogger(GreetingController.class);
	
	@GetMapping("/{name}")
	public String greeting(@PathVariable String name){
	logger.debug("name resuest");
	if (name.equalsIgnoreCase("test")) {
        throw new RuntimeException("Exception raised!!");
    }
    String response = "Hi " + name + " Welcome to Java SpringBoot Logging demo";
    logger.debug("Response {}", response);
    return response;

	}
	
	
}
