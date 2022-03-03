package com.agua;

import com.agua.notification.Cadastro;
import com.agua.notification.Contrato;
import com.agua.notification.Endereco;
import com.agua.notification.Pessoa;
import com.agua.service.contratoService;

public class App {
    public static void main( String[] args ){
        Contrato contrato = new Contrato();
        contrato.setNumeroProtocolo(123);

        Cadastro cadastro = new Cadastro();
        cadastro.setAtivo(true);
        cadastro.setNumero(27);

        Pessoa pessoa = new Pessoa();
        pessoa.setCpf("123123");
        pessoa.setNome("bruno");
        pessoa.setRg("132323");
        pessoa.setTelefone("123123123123");

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

        System.out.println(service.conteudoContrato(contrato));
    }
}
