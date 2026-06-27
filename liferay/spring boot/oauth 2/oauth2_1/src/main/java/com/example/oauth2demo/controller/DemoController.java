package com.example.oauth2demo.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class DemoController {

    @GetMapping("/")
    public String publicIndex() {
        return "Welcome! This page is public.";
    }

    @GetMapping("/secured")
    public Map<String, Object> securedEndpoint(@AuthenticationPrincipal OAuth2User principal) {
        // Returns the user profile attributes retrieved from the provider
        return principal.getAttributes();
    }
}
