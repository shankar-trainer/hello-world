package com.smarthas.dto;

import com.smarthas.model.Role;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Set;

@Data
public class UserCreateRequest {
    @NotBlank
    private String username;

    @NotBlank
    private String password;

    @NotNull
    private Set<Role> roles; // ROLE_USER ou ROLE_ADMIN
}