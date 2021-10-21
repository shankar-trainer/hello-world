package cts.com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ConfigServiceController {
	

    @Value("${welcome.message}")

	String welcomeText;
	@GetMapping("/go")
	public String welcomeText() {
		return welcomeText;
	}
	
}
