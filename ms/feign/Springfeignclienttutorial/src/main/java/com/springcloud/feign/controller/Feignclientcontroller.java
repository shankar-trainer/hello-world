package com.springcloud.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

// Application url - localhost:9191/feign/getGreetings/en

@RestController
@RequestMapping(value= "/feign")
public class Feignclientcontroller {

	@Autowired
	Greetingsclient greetingsfeignclient;

	/**
	 * Method to fetch the greetings information from the different microservices via feign client (i.e. declarative approach).
	 * @param langCode
	 * @return
	 */
	@GetMapping(value="/getGreetings/{localeId}", produces= MediaType.APPLICATION_JSON_VALUE)
	@HystrixCommand(fallbackMethod= "defaultResponse")
	public ResponseEntity<String> getGreetingsAndUserInfoViaFeign(@PathVariable(name= "localeId") String langCode) {
		System.out.println("Using the feign client controller to fetch the greetings information for locale= " + langCode);

		// Fetching the greetings salutation for the given locale. 
		// Data is fetched from thr greetings microservice hosted on port no. - 8181
		String greetMsg = greetingsfeignclient.getGreetings(langCode);
		System.out.println("Welcome msg for locale= " + langCode + ", is= " + greetMsg);

		// Sending the response
		return new ResponseEntity<String>(greetMsg, HttpStatus.OK);
	}

	// When we define a fallback-method, the fallback-method must match the same parameters of the method where you define the Hystrix Command using the hystrix-command annotation.
	public ResponseEntity<String> defaultResponse(String err) {
		System.out.println("You are seeing this fallback response because the underlying microservice is down.");
		err = "Fallback error as the microservice is down.";
		return new ResponseEntity<String>(err, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}