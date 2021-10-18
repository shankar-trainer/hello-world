package com.profesorp.configclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.profesorp.configclient.bean.BeanConfiguration;
//http://localhost:8080/limites

@RestController
public class ConfigServiceController {
	

    @Value("${welcome.message}")

	String welcomeText;
	@GetMapping("/go")
	public String welcomeText() {
		return welcomeText;
	}
	
}
