package com.smarthas.repository;

import com.smarthas.model.Ocorrencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OcorrenciaRepository extends JpaRepository<Ocorrencia, Long> {
    long countByUserId(Long userId);
}