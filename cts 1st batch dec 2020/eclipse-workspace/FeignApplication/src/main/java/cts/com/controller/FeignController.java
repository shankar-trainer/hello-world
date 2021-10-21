package cts.com.controller;

import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/feign")
public class FeignController {
	
	@Autowired
	FeignClientApp clientapp;
	
	
	@GetMapping(value="/feignData/{id}", produces= MediaType.APPLICATION_JSON_VALUE)
	@HystrixCommand(fallbackMethod= "defaultResponse")
		public ResponseEntity<String> getInfo(@PathVariable(value= "id") String id){
		
	  return new ResponseEntity<String>	(clientapp.getCountry(id),HttpStatus.OK);
		
	}
	
	
	public ResponseEntity<String>	defaultResponse(String err){
		  return new ResponseEntity<String>	(err,HttpStatus.INTERNAL_SERVER_ERROR);
				
	}
	
	
	
}
