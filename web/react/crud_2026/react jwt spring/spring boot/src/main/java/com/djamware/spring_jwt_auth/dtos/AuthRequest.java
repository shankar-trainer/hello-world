package com.djamware.spring_jwt_auth.dtos;

import lombok.Data;

@Data
public class AuthRequest {
    private String username;
    private String password;
}
