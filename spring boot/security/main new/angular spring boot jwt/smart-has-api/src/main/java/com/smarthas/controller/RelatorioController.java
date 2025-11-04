package com.smarthas.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import javax.sql.DataSource;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/relatorios")
public class RelatorioController {

    private final DataSource dataSource;

    public RelatorioController(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @GetMapping("/ocorrencias/{userId}")
    @PreAuthorize("hasAnyRole('USER','ADMIN')")
    public ResponseEntity<?> gerarRelatorio(@PathVariable("userId") Long userId) {
        Map<String, Object> resultado = new HashMap<>();

        try (Connection conn = dataSource.getConnection();
             CallableStatement cs = conn.prepareCall("{ call pr_relatorio_ocorrencias_usuario(?, ?, ?, ?) }")) {

            cs.setLong(1, userId);
            cs.registerOutParameter(2, Types.NUMERIC);
            cs.registerOutParameter(3, Types.TIMESTAMP);
            cs.registerOutParameter(4, Types.VARCHAR);

            cs.execute();

            resultado.put("userId", userId);
            resultado.put("qtdOcorrencias", cs.getInt(2));
            resultado.put("ultimaData", cs.getTimestamp(3));
            resultado.put("ultimaTitulo", cs.getString(4));

            return ResponseEntity.ok(resultado);

        } catch (SQLException e) {
            return ResponseEntity.internalServerError().body("Erro ao executar relatório: " + e.getMessage());
        }
    }
}
