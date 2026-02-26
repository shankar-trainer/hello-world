

package com.example.web;

import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/")
    public String home(Authentication authentication) {
        if (authentication instanceof OAuth2AuthenticationToken) {
            String userName = ((OAuth2AuthenticationToken) authentication).getPrincipal().getAttribute("name");
            return "Hello, " + userName + "!";
        }
        return "Hello, Guest!";
    }
}
