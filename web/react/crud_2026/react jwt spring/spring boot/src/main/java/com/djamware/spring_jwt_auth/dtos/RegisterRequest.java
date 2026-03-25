package com.djamware.spring_jwt_auth.dtos;

import java.util.Set;

import lombok.Data;

@Data
public class RegisterRequest {
    private String username;
    private String password;
    private Set<String> roles;
}
