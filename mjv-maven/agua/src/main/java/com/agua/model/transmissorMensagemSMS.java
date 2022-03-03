package com.agua.model;

public class transmissorMensagemSMS extends transmissorMensagem{

    @Override
    public void transmitir(String telefoneDestino, String mensagem) {
        System.out.println("Transmitindo SMS ");
        System.out.println("Telefone destino: " + telefoneDestino);
        System.out.println("Mensagem");
    }
}
