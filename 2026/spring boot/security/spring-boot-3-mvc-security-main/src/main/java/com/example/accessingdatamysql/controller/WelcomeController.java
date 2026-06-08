

package com.example.accessingdatamysql.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// This Controller is saving a welcome message in the model to be used in the JSP View
// It is using GetMapping to get url request by both /home and /welcome
@Controller
public class WelcomeController {
	
	private String helloworld = "";
	
	int mb = 1024*1024;
		
	//@GetMapping("/")
	//@GetMapping({"/welcome", "/home"})
	@GetMapping({"/", "/welcome"})
	public String welcome(Map<String, Object> model) {

			
	//Getting the runtime reference from system
	Runtime runtime = Runtime.getRuntime();
	
	//Print used memory    
	long usedmemory = (runtime.totalMemory() - runtime.freeMemory()) / mb;

	
	//Print free memory
	long freememory = runtime.freeMemory() / mb;

	// Print total available memory / Initial memory that the JVM will have available
	// In Azure I defined a max memory for JVM  of 512 megabytes: JAVA_TOOL_OPTIONS = "-Xms512m"
	// NOTE: I did only have one configuration for both min and max defined like key/value:
	// Key: JAVA_TOOL_OPTIONS 
	// Values: -Xms512m -Xmx512m
	long totalmemory = runtime.totalMemory() / mb;
	
	// Print Maximum available memory that the JVM will have available
	// In Azure I defined a max memory for JVM of 512 megabytes: JAVA_TOOL_OPTIONS = "-Xmx512m"
	long maxmemory = runtime.maxMemory() / mb;
	
	String memoryheapS = "JVM Memory info in MB - Used: " + usedmemory + " Free: " + freememory + " Total: " + totalmemory + " Max: " + maxmemory;

	model.put("memorymessage", memoryheapS);

	helloworld = "Welcome to a Java Spring Boot 3 MVC JSP JPA Security Web application!";

	model.put("welcomemessage", helloworld);
				
	return "welcome";
	}
}