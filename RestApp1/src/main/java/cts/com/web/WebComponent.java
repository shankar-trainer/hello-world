package cts.com.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cts.com.MainApp;

@RestController
@RequestMapping("app")
public class WebComponent {
	static Logger logger=LoggerFactory.getLogger(WebComponent.class);

	@RequestMapping("/hello")
	public String hello() {
		logger.info("inside  hello method");
		return "hello world";
	}
	
     @GetMapping
	public String hello1() {
    	 logger.info("inside  hello1 method");
		return "hello world";
	}
	
}
