package com.example.web;

import com.example.model.AuthRequest;
import com.example.model.User;
import com.example.service.JwtService;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtService jwtService;

    @RequestMapping("/welcome")
    public String welcome() {
        return "welcome to jwt";
    }

    @PostMapping("/addNewUser")
    public String addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @RequestMapping("/generateToken")
    public String generateToke(@RequestBody AuthRequest authRequest) {
        Authentication authenticate = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));

        if (authenticate.isAuthenticated())
            return jwtService.generateToken(authRequest.getUsername());
        else
            throw new IllegalArgumentException("user not  found");
    }
}
