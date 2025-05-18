package com.example.diet.models;

import com.example.diet.exception.ValorInvalido;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class AlimentoTest {

    @Test
    void setProteinasInvalidas() {
        Alimento alimento = new Alimento();
        assertThrows(ValorInvalido.class, () -> alimento.setProteinas(-1.0));
    }

}