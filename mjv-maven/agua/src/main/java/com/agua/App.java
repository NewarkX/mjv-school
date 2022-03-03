package com.agua;

import com.agua.notification.model.*;
import com.agua.service.contratoService;

public class App {
    public static void main( String[] args ){
        Contrato contrato = new Contrato();
        contrato.setNumeroProtocolo(123);

        Cadastro cadastro = new Cadastro();
        cadastro.setAtivo(true);
        cadastro.setNumero(27);
        cadastro.setNotificacaoTipo(notificacaoTipo.WHATS   );

        Pessoa pessoa = new Pessoa();
        pessoa.setCpf("123123");
        pessoa.setNome("bruno");
        pessoa.setRg("132323");
        pessoa.setTelefone("998977654");

        Endereco endereco = new Endereco();
        endereco.setBairro("santo antonio");
        endereco.setCep("27.313-123");
        endereco.setCidade("sao paulo");
        endereco.setEstado("sp");
        endereco.setLogradouro("ruas das marias");
        endereco.setNumero("21");

        cadastro.setPessoa(pessoa);
        contrato.setCadastro(cadastro);

        contratoService service = new contratoService();
        String mensagem = service.conteudoContrato(contrato);

        transmissorMensagem transmissor = null;
        if(cadastro.getNotificacaoTipo() == notificacaoTipo.SMS)
            transmissor = new transmissorMensagemSMS();
        else
            transmissor = new transmissorMensagemWhats();

        transmissor.transmitir(contrato.getCadastro().getPessoa().getTelefone(), mensagem);

        System.out.println(service.conteudoContrato(contrato));
    }
}
