package com.agualuz.model;

public class Contrato {
    private long numeroProtocolo;
    private Pessoa cadastro;
    private Servico servico;
    private Endereco endereco;

    public long getNumeroProtocolo() {
        return numeroProtocolo;
    }

    public void setNumeroProtocolo(long numeroProtocolo) {
        this.numeroProtocolo = numeroProtocolo;
    }

    public Pessoa getCadastro() {
        return cadastro;
    }

    public void setCadastro(Pessoa cadastro) {
        this.cadastro = cadastro;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
