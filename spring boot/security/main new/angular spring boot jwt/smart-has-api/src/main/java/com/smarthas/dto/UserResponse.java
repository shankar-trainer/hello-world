package com.smarthas.dto;

import com.smarthas.model.Role;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Data
@AllArgsConstructor
public class UserResponse {
    private Long id;
    private String username;
    private Set<Role> roles;
    private int ocorrenciasCount;
}