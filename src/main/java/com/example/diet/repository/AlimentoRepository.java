package com.example.diet.repository;

import com.example.diet.models.Alimento;

import java.util.List;

public interface AlimentoRepository {

    void save(Alimento alimento);

    List<Alimento> list();
}
