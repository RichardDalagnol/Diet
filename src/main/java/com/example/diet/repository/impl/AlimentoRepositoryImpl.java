package com.example.diet.repository.impl;

import com.example.diet.models.Alimento;
import com.example.diet.repository.AlimentoRepository;

import java.util.ArrayList;
import java.util.List;

public class AlimentoRepositoryImpl implements AlimentoRepository {
    private final List<Alimento> alimentos = new ArrayList<>();
    @Override
    public List<Alimento> list() {
        return alimentos;
    }
    @Override
    public void save(Alimento alimento) {
        alimentos.add(alimento);
    }
}
