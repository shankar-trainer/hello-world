

package com.example.accessingdatamysql.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// This Controller is saving a hello message in the model to be used in the JSP View
// It is using GetMapping to get url request by /hello
@Controller
public class HelloController {
	
	private String helloworld = "";
	
	@GetMapping({"/hello"})
	public String hello(Map<String, Object> model) {

	helloworld = "22-01-2025";

	model.put("hellomessage", helloworld);
				
	return "hello";
	}
}