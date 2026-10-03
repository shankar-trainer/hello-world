package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.security.JwtService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.security.authentication.*;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authManager;

    @Autowired
    private JwtService jwtService;

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user) {
        return ResponseEntity.ok(userService.registerUser(user));
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> request) {
        authManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.get("username"), request.get("password")));

        UserDetails userDetails = userService.loadUserByUsername(request.get("username"));
        String token = jwtService.generateToken(userDetails.getUsername(),
                userDetails.getAuthorities().iterator().next().getAuthority());

        return ResponseEntity.ok(Map.of("token", token));
    }
}
