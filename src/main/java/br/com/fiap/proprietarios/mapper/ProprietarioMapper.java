package br.com.fiap.proprietarios.mapper;

import br.com.fiap.proprietarios.model.entity.ProprietarioEntity;
import br.com.fiap.proprietarios.model.request.ProprietarioRequest;
import br.com.fiap.proprietarios.model.response.ProprietarioResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class ProprietarioMapper {
    public ProprietarioRequest fromEntity(ProprietarioEntity entity) {
        var request = new ProprietarioRequest();

        BeanUtils.copyProperties(entity, request);

        return request;
    }

    public ProprietarioEntity fromRequest(ProprietarioRequest request) {
        var entity = new ProprietarioEntity();

        BeanUtils.copyProperties(entity, request);

        return entity;
    }

    public ProprietarioResponse toResponse(ProprietarioEntity entity) {
        var response = new ProprietarioResponse();

        BeanUtils.copyProperties(response, entity);

        return response;
    }
}
