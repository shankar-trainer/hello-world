package com.springcloud.feign.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name= "greetings")
public interface Greetingsclient {

	/**
	 * Interface method to get the greetings information from a different microservice.
	 * @param langCode
	 * @return
	 */
	@GetMapping(value= "/greet/welcome/{localeId}")
	public String getGreetings(@PathVariable(name= "localeId") String langCode);
}