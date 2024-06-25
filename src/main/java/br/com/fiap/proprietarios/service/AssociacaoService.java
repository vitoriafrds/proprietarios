package br.com.fiap.proprietarios.service;

import br.com.fiap.proprietarios.model.entity.AssociacaoChaveEntity;
import br.com.fiap.proprietarios.model.entity.AssociacaoChaveId;
import br.com.fiap.proprietarios.model.request.AssociacaoRequest;
import br.com.fiap.proprietarios.repository.AssociacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class AssociacaoService {
    private AssociacaoRepository repository;

    @Autowired
    public AssociacaoService(AssociacaoRepository repository) {
        this.repository = repository;
    }

    public void associar(AssociacaoRequest request) {
        AssociacaoChaveEntity entity = new AssociacaoChaveEntity();
        entity.setId(new AssociacaoChaveId(request.getIdProprietario().toString(), request.getChaveVeiculo().toString()));
        entity.setDataCriacao(LocalDateTime.now());

        repository.save(entity);
    }
}
