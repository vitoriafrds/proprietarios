package br.com.fiap.proprietarios.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProprietarioRequest {
    private int id;
    private String nome;
    private String email;

    @JsonProperty("data_nascimento")
    private LocalDate dataNascimento;
    private String telefone;
    private String documento;
}
