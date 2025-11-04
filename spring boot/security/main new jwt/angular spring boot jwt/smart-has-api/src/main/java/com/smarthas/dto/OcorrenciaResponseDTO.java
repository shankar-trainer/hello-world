package com.smarthas.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.smarthas.model.Ocorrencia;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class OcorrenciaResponseDTO {

    private Long id;
    private String titulo;
    private String descricao;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime data;

    private String username; // 👈 pega só o nome do usuário

    public OcorrenciaResponseDTO(Ocorrencia ocorrencia) {
        this.id = ocorrencia.getId();
        this.titulo = ocorrencia.getTitulo();
        this.descricao = ocorrencia.getDescricao();
        this.data = ocorrencia.getData();
        this.username = ocorrencia.getUser().getUsername(); // 👈 aqui resolve o problema do LAZY
    }
}
