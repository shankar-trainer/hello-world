package com.eurekaclient.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value= "/greet")
public class Greetingsctrl {
	// Greetings map.
	static Map<String, String> greetings;
	// Initialize the greetings map at the application start-up.
	static {
		greetings = new HashMap<String, String>();
		greetings.put("fr", "BONJOUR");
		greetings.put("es", "HOLA");
		greetings.put("de", "GUTENTAG");
		greetings.put("it", "CIAO");
		greetings.put("hi", "नमस्ते");
		greetings.put("en", "GOOD MORNING");
	}

	@GetMapping(value= "/welcome/{localeId}")
	public String getGreetings(@PathVariable(name= "localeId") String langCode) {
		System.out.println("Fetching greetings type for locale id= " + langCode);
		String msg = greetings.entrySet().stream().filter((code) -> langCode.equalsIgnoreCase(code.getKey()))
				.map(langName -> langName.getValue()).collect(Collectors.joining());
		return msg;
	}
}