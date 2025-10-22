package com.abc.web;

import com.abc.model.AuthRequest;
import com.abc.model.User;
import com.abc.service.JwtService;
import com.abc.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
public class PersonController {

    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private UserService service;

    @Autowired
    private JwtService jwtService;

    @GetMapping("/welcome")
    public String hello() {
        return "hello world";
    }

    @PostMapping("/generateToken")
    public String authenticateAndGetToken(@RequestBody AuthRequest authRequest) {
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));
        if (authentication.isAuthenticated()) {
        log.warn("authenticated");
            return jwtService.generateToken(authRequest.getUsername());
        } else {
            log.error("invalid user request");
            throw new UsernameNotFoundException("invalid user request !");
        }
    }

    @PostMapping("/addNewUser")
    public String addNewUser(@RequestBody User userInfo) {
        return service.addUser(userInfo);
    }
}
