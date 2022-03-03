package com.agua.model;

public class transmissorMensagemWhats extends transmissorMensagem {
    @Override
    public void transmitir(String telefoneDestino, String mensagem) {
        System.out.println("Transmitindo Whats ");
        System.out.println("Telefone destino: " + telefoneDestino);
        System.out.println("Mensagem");
    }
}
