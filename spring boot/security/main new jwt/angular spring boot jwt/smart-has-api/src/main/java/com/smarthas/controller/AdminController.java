package com.smarthas.controller;

import com.smarthas.dto.UserCreateRequest;
import com.smarthas.dto.UserResponse;
import com.smarthas.model.UserAccount;
import com.smarthas.repository.OcorrenciaRepository;
import com.smarthas.repository.UserAccountRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/admin")
@PreAuthorize("hasRole('ADMIN')")
public class AdminController {

    private final UserAccountRepository userRepo;
    private final OcorrenciaRepository ocorrenciaRepo;
    private final PasswordEncoder passwordEncoder;

    public AdminController(UserAccountRepository userRepo,
                           OcorrenciaRepository ocorrenciaRepo,
                           PasswordEncoder passwordEncoder) {
        this.userRepo = userRepo;
        this.ocorrenciaRepo = ocorrenciaRepo;
        this.passwordEncoder = passwordEncoder;
    }

    // Criar usuário
    @PostMapping("/users")
    public ResponseEntity<?> criarUsuario(@Valid @RequestBody UserCreateRequest req) {
        if (userRepo.existsByUsername(req.getUsername())) {
            return ResponseEntity.badRequest().body("Usuário já existe");
        }
        UserAccount ua = UserAccount.builder()
                .username(req.getUsername())
                .password(passwordEncoder.encode(req.getPassword()))
                .roles(req.getRoles())
                .build();
        userRepo.save(ua);
        return ResponseEntity.ok("Usuário criado com sucesso");
    }

    // Listar todos os usuários + contagem de ocorrencias
    @GetMapping("/users")
    public List<UserResponse> listarUsuarios() {
        return userRepo.findAll().stream()
                .map(u -> new UserResponse(
                        u.getId(),
                        u.getUsername(),
                        u.getRoles(),
                        (int) ocorrenciaRepo.countByUserId(u.getId()) // usando método customizado
                ))
                .collect(Collectors.toList());
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<?> atualizarUsuario( @PathVariable("id") Long id, @RequestBody UserCreateRequest req) {
        return userRepo.findById(id).map(u -> {
            u.setUsername(req.getUsername());
            // Atualiza senha apenas se for enviada
            if (req.getPassword() != null && !req.getPassword().isBlank()) {
                u.setPassword(passwordEncoder.encode(req.getPassword()));
            }
            u.setRoles(req.getRoles());
            userRepo.save(u);
            return ResponseEntity.ok("Usuário atualizado com sucesso");
        }).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Buscar usuário por ID
    @GetMapping("/users/{id}")
    public ResponseEntity<UserResponse> buscarUsuarioPorId(@PathVariable Long id) {
        return userRepo.findById(id)
                .map(u -> new UserResponse(
                        u.getId(),
                        u.getUsername(),
                        u.getRoles(),
                        (int) ocorrenciaRepo.countByUserId(u.getId())
                ))
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Banir usuário (deletar)
    @DeleteMapping("/users/{id}")
    public ResponseEntity<?> banirUsuario(@PathVariable Long id) {
        if (!userRepo.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        userRepo.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}