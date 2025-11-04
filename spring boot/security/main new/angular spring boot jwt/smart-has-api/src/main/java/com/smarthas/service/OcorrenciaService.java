package com.smarthas.service;

import com.smarthas.exception.ResourceNotFoundException;
import com.smarthas.model.Ocorrencia;
import com.smarthas.repository.OcorrenciaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OcorrenciaService {
    private final OcorrenciaRepository repository;

    public OcorrenciaService(OcorrenciaRepository repository) {
        this.repository = repository;
    }

    public List<Ocorrencia> listarTodas() {
        return repository.findAll();
    }

    public Ocorrencia buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Ocorrência não encontrada:" + id));
    }

    public Ocorrencia salvar(Ocorrencia o) {
        return repository.save(o);
    }

    public Ocorrencia atualizar(Long id, Ocorrencia nova) {
        Ocorrencia ex = buscarPorId(id);
        ex.setTitulo(nova.getTitulo());
        ex.setData(nova.getData());
        ex.setDescricao(nova.getDescricao());
        return repository.save(ex);
    }

    public void deletar(Long id) {
        repository.delete(buscarPorId(id));
    }
}