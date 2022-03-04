package com.agualuz.model;

public enum Pais {
    BRASIL ("BR","Brasil"),
    PERU ("PE","Peru"),
    ESTADOS_UNIDOS ("US","Estados Unidos");

    private String sigla;
    private String nome;

    private Pais(String sigla,String nome){
        this.nome = nome;
        this.sigla = sigla;
    }

    

    /**
     * @return String return the sigla
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * @param sigla the sigla to set
     */
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

}
