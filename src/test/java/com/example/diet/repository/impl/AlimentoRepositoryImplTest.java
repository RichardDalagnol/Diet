package com.example.diet.repository.impl;

import com.example.diet.models.Alimento;
import org.junit.jupiter.api.Test;

import java.util.List;

class AlimentoRepositoryImplTest {
    private final AlimentoRepositoryImpl  alimentoRepository = new AlimentoRepositoryImpl();

    @Test
    void list() {
        List<Alimento> alimentoList = alimentoRepository.list();
        System.out.printf(alimentoList.toString());
    }

    @Test
    void save() {
        Alimento alimento = new Alimento();
        alimento.setNome("teste");
        alimento.setCarboidratos(1.0);
        alimento.setProteinas(1.0);
        alimento.setGorduras(1.0);
        alimento.setCalorias();
        alimentoRepository.save(alimento);
    }
}