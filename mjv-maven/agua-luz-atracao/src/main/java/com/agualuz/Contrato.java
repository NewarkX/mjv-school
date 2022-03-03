package com.agualuz;

public class Contrato {
    private long numeroProtocolo;
    private Cadastro cadastro;
    private Servico servico;

    public long getNumeroProtocolo() {
        return numeroProtocolo;
    }

    public void setNumeroProtocolo(long numeroProtocolo) {
        this.numeroProtocolo = numeroProtocolo;
    }

    public Cadastro getCadastro() {
        return cadastro;
    }

    public void setCadastro(Cadastro cadastro) {
        this.cadastro = cadastro;
    }
}
