package com.pos.repository;

import com.pos.entities.UnidadMedidaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUnidadMedidaRepository extends JpaRepository <UnidadMedidaEntity,Long> {
}
