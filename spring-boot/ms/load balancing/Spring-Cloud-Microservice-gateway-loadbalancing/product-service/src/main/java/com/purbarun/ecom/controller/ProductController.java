package com.purbarun.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.purbarun.ecom.model.GreetingResponse;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Value("${eureka.instance.instance-id}")
	private String instanceId;
	@Value("${spring.application.name}")
	private String appName;
	private EurekaClient eurekaClient;

	public ProductController(EurekaClient eurekaClient) {
		this.eurekaClient = eurekaClient;
	}


	@GetMapping("/greet")
	public ResponseEntity<GreetingResponse> getProduct(HttpServletRequest request) {
		InstanceInfo service = eurekaClient.getApplication(appName).getInstances().get(0);
		GreetingResponse response = new GreetingResponse();
		response.setGreeting("Hello from Product service !!");
		response.setInstanceid(instanceId);
		response.setPort(service.getPort());
		response.setUrl(request.getRequestURL().toString());
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
