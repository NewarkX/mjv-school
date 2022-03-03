package com.agua.service;

import com.agua.notification.model.Contrato;

public class contratoService {

    public String conteudoContrato(Contrato contrato){
        String texto = "";
        texto = texto + "Senhor(a) " + contrato.getCadastro().getPessoa().getNome();
        texto = texto + " informamos que conforme contrato com protocolo de numero " + contrato.getNumeroProtocolo();
        return texto;
    }
}
