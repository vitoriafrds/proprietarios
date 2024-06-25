package br.com.fiap.proprietarios.service;

import br.com.fiap.proprietarios.mapper.ProprietarioMapper;
import br.com.fiap.proprietarios.model.entity.ProprietarioEntity;
import br.com.fiap.proprietarios.model.request.ProprietarioRequest;
import br.com.fiap.proprietarios.model.response.ProprietarioResponse;
import br.com.fiap.proprietarios.repository.ProprietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProprietarioService {
    private ProprietarioRepository repository;
    private ProprietarioMapper mapper;

    @Autowired
    public ProprietarioService(ProprietarioRepository repository, ProprietarioMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public ProprietarioResponse create(ProprietarioRequest proprietario) {
        ProprietarioEntity entity = new ProprietarioEntity();
        entity.setNome(proprietario.getNome());
        entity.setDocumento(proprietario.getDocumento());
        entity.setEmail(proprietario.getEmail());
        entity.setDataNascimento(proprietario.getDataNascimento());
        entity.setTelefone(proprietario.getTelefone());

        ProprietarioEntity result = this.repository.save(entity);

        return new ProprietarioResponse(result.getId().toString());
    }
}
