package br.com.fiap.proprietarios.model.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class AssociacaoChaveId implements Serializable {
    private String idProprietario;
    private String chaveVeiculo;
}
