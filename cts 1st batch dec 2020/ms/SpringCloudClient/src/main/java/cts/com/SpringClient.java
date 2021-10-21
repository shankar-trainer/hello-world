package cts.com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringClient {

	public static void main(String[] args) {

		SpringApplication.run(SpringClient.class, args);
	}

	@Value("${hello.message}")
	String msg;

	@Value("${hello.location}")
	String msg1;

	@RequestMapping("/welcome/test1")
	public String welcome() {
		return msg;
	}

	@RequestMapping("/welcome/test2")
	public String welcome1() {
		return msg1;
	}

}
