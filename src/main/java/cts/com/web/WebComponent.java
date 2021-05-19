package cts.com.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("app")
public class WebComponent {
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello world";
	}
	
     @GetMapping
	public String hello1() {
		return "hello world";
	}
	
}
