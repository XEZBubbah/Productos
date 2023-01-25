package com.pos.jpatest;

import com.pos.entities.UnidadMedidaEntity;
import com.pos.repository.IUnidadMedidaRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
public class UnidadMedidadTest {

    @Autowired
    private IUnidadMedidaRepository unidadMedidaRepository;

    @Test
    public void whenFindUnidadMedidad_thenResultListUnidadMedida() {

        var unidadGuardada = unidadMedidaRepository.save(UnidadMedidaEntity.builder().descripcion("Litro").build());
        //List<UnidadMedidaEntity> consulta = unidadMedidaRepository.findAll();
        Assertions.assertNotNull(unidadGuardada);
    }
}
