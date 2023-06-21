package com.example.OauthApp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@RestController
public class OauthApp1Application {

    public static void main(String[] args) {
        SpringApplication.run(OauthApp1Application.class, args);
    }

	@GetMapping("/")
    public String disp(Principal principal) {
        return "welcome to oauth app<br>User is " + principal.getName();
    }
}
