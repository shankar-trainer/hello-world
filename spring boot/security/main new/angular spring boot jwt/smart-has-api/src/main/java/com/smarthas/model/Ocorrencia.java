package com.smarthas.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "ocorrencias")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Ocorrencia {

    @Id
    @SequenceGenerator(name = "ocorr_seq", sequenceName = "OCORRENCIAS_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ocorr_seq")
    private Long id;

    @NotBlank(message = "O título é obrigatório")
    private String titulo;

    @NotNull(message = "A data é obrigatória")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime data;

    @NotBlank(message = "A descrição é obrigatória")
    @Column(length = 2000)
    private String descricao;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private UserAccount user;  // <- aqui é o que faltava
}
