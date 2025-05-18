package com.example.diet.models;

import com.example.diet.exception.ValorInvalido;

public class Alimento {

    private String nome;
    private Double calorias;
    private Double proteinas;
    private Double carboidratos;
    private Double gorduras;

    public Alimento() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getCalorias() {
        return calorias;
    }

    public void setCalorias() {
        this.calorias = (this.carboidratos + this.proteinas) * 4 + this.gorduras * 9;
    }

    public Double getProteinas() {
        return proteinas;
    }

    public void setProteinas(Double proteinas) {
        if (proteinas == null || proteinas < 0){
           throw new ValorInvalido("Valor para proteinas invalido");
        }
        this.proteinas = proteinas;
    }

    public Double getCarboidratos() {
        return carboidratos;
    }

    public void setCarboidratos(Double carboidratos) {
        this.carboidratos = carboidratos;
    }

    public Double getGorduras() {
        return gorduras;
    }

    public void setGorduras(Double gorduras) {
        this.gorduras = gorduras;
    }


}
