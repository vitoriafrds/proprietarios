package br.com.fiap.proprietarios.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "COMPONENTE")
public class ComponenteEntity {

    @Id
    private int id;

    @Column(name = "NOME")
    private String nome;

    public ComponenteEntity(int id) {
        this.id = id;
    }
}
