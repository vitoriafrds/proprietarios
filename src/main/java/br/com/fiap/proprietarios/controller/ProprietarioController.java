package br.com.fiap.proprietarios.controller;

import br.com.fiap.proprietarios.model.request.AssociacaoRequest;
import br.com.fiap.proprietarios.model.request.ProprietarioRequest;
import br.com.fiap.proprietarios.model.response.DataResponse;
import br.com.fiap.proprietarios.model.response.ProprietarioResponse;
import br.com.fiap.proprietarios.service.AssociacaoService;
import br.com.fiap.proprietarios.service.ProprietarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/proprietarios")
public class ProprietarioController {
    private ProprietarioService service;
    private AssociacaoService associacaoService;

    @Autowired
    public ProprietarioController(ProprietarioService service, AssociacaoService associacaoService) {
        this.service = service;
        this.associacaoService = associacaoService;
    }

    @PostMapping
    public ResponseEntity<DataResponse<ProprietarioResponse>> criar(@RequestBody ProprietarioRequest request) {
        ProprietarioResponse response = service.create(request);
        return ResponseEntity.ok(DataResponse.of(response));
    }

    @PostMapping("/associacoes")
    public ResponseEntity<Void> associar(@RequestBody AssociacaoRequest request) {
        associacaoService.associar(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
