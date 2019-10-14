package com.example.guiadasavesparaibanas.modelo;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Ave extends Serializable {

    private String id;
    private String nome;
    private String especie;
    private String familia;
    private String alimentacao;
    private String habitat;

    public Ave(String id, String nome, String especie, String familia, String alimentacao, String habitat) {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.familia = familia;
        this.alimentacao = alimentacao;
        this.habitat = habitat;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @NonNull
    @Override
    public String toString() {
        return nome;
    }
}
