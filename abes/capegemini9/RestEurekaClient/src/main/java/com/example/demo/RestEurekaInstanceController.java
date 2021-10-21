package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestEurekaInstanceController {

	@Autowired
	DiscoveryClient client;
	
	@RequestMapping("/service-instances/{applicationName}")
	public List<ServiceInstance> getInstanceByAppName(@PathVariable("applicationName") String applicationName){
	  return this.client.getInstances(applicationName);	
	}
	
}
