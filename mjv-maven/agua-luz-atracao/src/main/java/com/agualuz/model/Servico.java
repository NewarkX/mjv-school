package com.agualuz.model;

public enum Servico {
    AGUA("Água",137.21),
    LUZ("Luz",132.15);

    private String nome;
    private Double valor;

    private Servico(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
