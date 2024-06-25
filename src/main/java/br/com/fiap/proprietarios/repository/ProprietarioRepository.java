package br.com.fiap.proprietarios.repository;

import br.com.fiap.proprietarios.model.entity.ProprietarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProprietarioRepository extends JpaRepository<ProprietarioEntity, Integer> {
}
