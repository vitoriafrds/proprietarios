package br.com.fiap.proprietarios.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AssociacaoRequest implements Serializable {

    @JsonProperty("id_proprietario")
    private UUID idProprietario;

    @JsonProperty("chave_veiculo")
    private UUID chaveVeiculo;
}
