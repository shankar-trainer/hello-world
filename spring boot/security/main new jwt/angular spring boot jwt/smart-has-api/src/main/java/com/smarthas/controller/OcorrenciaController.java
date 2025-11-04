package com.smarthas.controller;

import com.smarthas.dto.OcorrenciaResponseDTO;
import com.smarthas.model.Ocorrencia;
import com.smarthas.model.UserAccount;
import com.smarthas.repository.UserAccountRepository;
import com.smarthas.service.OcorrenciaService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import java.util.List;

// DTO para entrada de dados
import com.smarthas.dto.OcorrenciaDTO;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/ocorrencias")
public class OcorrenciaController {

    private final UserAccountRepository userRepo;

    private final OcorrenciaService service;

    public OcorrenciaController(OcorrenciaService service, UserAccountRepository userRepo) {
        this.service = service;
        this.userRepo = userRepo;
    }

    @GetMapping
    @PreAuthorize("hasAnyRole('USER','ADMIN')")
    public List<OcorrenciaResponseDTO> listarTodas() {
        return service.listarTodas()
                .stream()
                .map(OcorrenciaResponseDTO::new)
                .toList();
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAnyRole('USER','ADMIN')")
    public ResponseEntity<OcorrenciaResponseDTO> buscarPorId(@PathVariable Long id) {
        Ocorrencia ocorrencia = service.buscarPorId(id);
        return ResponseEntity.ok(new OcorrenciaResponseDTO(ocorrencia));
    }

    @PostMapping
    @PreAuthorize("hasAnyRole('USER','ADMIN')")
    public ResponseEntity<Ocorrencia> criar(@Valid @RequestBody Ocorrencia ocorrencia) {
        // Obter usuário autenticado
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        UserAccount user = userRepo.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        ocorrencia.setUser(user); // vincula o usuário
        return ResponseEntity.ok(service.salvar(ocorrencia));
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasAnyRole('USER','ADMIN')")
    public ResponseEntity<Ocorrencia> atualizar(
            @PathVariable("id") Long id,
            @Valid @RequestBody OcorrenciaDTO dto) {

        Ocorrencia atualizada = Ocorrencia.builder()
                .titulo(dto.getTitulo())
                .descricao(dto.getDescricao())
                .data(dto.getData())
                .build();

        Ocorrencia salva = service.atualizar(id, atualizada);
        return ResponseEntity.ok(salva);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Void> deletar(@PathVariable("id") Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}