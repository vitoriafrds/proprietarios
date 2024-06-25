package br.com.fiap.proprietarios.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ASSOCIACAO_CHAVE")
public class AssociacaoChaveEntity {
    @EmbeddedId
    private AssociacaoChaveId id;

    @Column(name = "DATA_CRIACAO")
    private LocalDateTime dataCriacao;
}
