package com.smarthas.controller;

import com.smarthas.dto.LoginRequest;
import com.smarthas.dto.RegisterRequest;
import com.smarthas.dto.TokenResponse;
import com.smarthas.model.Role;
import com.smarthas.model.UserAccount;
import com.smarthas.repository.UserAccountRepository;
import com.smarthas.security.JwtService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import
        org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/auth")

public class AuthController {
    private final AuthenticationManager authManager;
    private final JwtService jwtService;
    private final UserAccountRepository userRepo;
    private final PasswordEncoder encoder;

    public AuthController(AuthenticationManager authManager, JwtService
                                  jwtService,
                          UserAccountRepository userRepo, PasswordEncoder
                                  encoder) {
        this.authManager = authManager;
        this.jwtService = jwtService;
        this.userRepo = userRepo;
        this.encoder = encoder;
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@Valid @RequestBody RegisterRequest req) {
        if (userRepo.existsByUsername(req.getUsername())) {
            return ResponseEntity.badRequest().body(Map.of("message", "Usuário já existe"));
        }

        UserAccount ua = UserAccount.builder()
                .username(req.getUsername())
                .password(encoder.encode(req.getPassword()))
                .roles(Set.of(Role.ROLE_USER))
                .build();

        userRepo.save(ua);

        // Converte roles para String
        List<String> rolesAsStrings = ua.getRoles().stream()
                .map(Enum::name)
                .toList();

        Map<String, Object> claims = new HashMap<>();
        claims.put("roles", rolesAsStrings);

        String token = jwtService.generateToken(ua.getUsername(), claims);

        return ResponseEntity.ok(new TokenResponse(token));
    }

    @PostMapping("/login")
    public ResponseEntity<TokenResponse> login(@Valid @RequestBody
                                               LoginRequest req) {
        Authentication auth = authManager.authenticate(
                new UsernamePasswordAuthenticationToken(req.getUsername(),
                        req.getPassword()));
        String token = jwtService.generateToken(auth.getName(),
                Map.of("roles", auth.getAuthorities()));
        return ResponseEntity.ok(new TokenResponse(token));
    }
}