package br.com.fiap.proprietarios.repository;

import br.com.fiap.proprietarios.model.entity.AssociacaoChaveEntity;
import br.com.fiap.proprietarios.model.entity.AssociacaoChaveId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssociacaoRepository extends JpaRepository<AssociacaoChaveEntity, AssociacaoChaveId> {
}
