package com.agualuz;

import com.agualuz.model.*;
import com.agualuz.output.GeradorArquivo;
import com.agualuz.repository.ContratoRepository;

import java.io.IOException;
import java.util.List;

public class App{
    private static ContratoRepository contratoRepository = new ContratoRepository();;
    public static void main( String[] args ) {
        faseAtracao();
        try {
            faseGeracaoArquivo();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void faseGeracaoArquivo() throws IOException {
        List<Contrato> contratos =  contratoRepository.listarTodos();
        GeradorArquivo gerador = new GeradorArquivo();
        gerador.gerarArquivoCsv(contratos);
        gerador.gerarArquivoTxt(contratos);
    }

    private static void faseAtracao() {
        Contrato contrato = new Contrato();
        contrato.setNumeroProtocolo(123);
        contrato.setServico(Servico.LUZ);

        Pessoa pessoa = new Pessoa();
        pessoa.setCpf("56737284094");
        pessoa.setNome("Gleyson Sampaio de Oliveira");
        pessoa.setRg("89789");
        pessoa.setPais(Pais.BRASIL);
        pessoa.setCelular("998976546");

        Endereco endereco = new Endereco();
        endereco.setBairro("Santo Antonio");
        endereco.setCep("27310657");
        endereco.setCidade("São Paulo");
        endereco.setEstado("SP");
        endereco.setLogradouro("Rua das Cajazeiras 26");
        endereco.setNumero("243");
        pessoa.setEndereco(endereco);
        contrato.setCadastro(pessoa);
        contrato.setEndereco(endereco);

        contratoRepository.gravar(contrato);

        Contrato contrato2 = new Contrato();
        contrato2.setNumeroProtocolo(321);
        contrato2.setServico(Servico.AGUA);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setCpf("32123123");
        pessoa2.setNome("Raimundo Nonato Loureiro Castello Branco");
        pessoa2.setRg("6745674567");
        pessoa2.setPais(Pais.BRASIL);
        pessoa2.setCelular("9983456456");

        Endereco endereco2 = new Endereco();
        endereco2.setBairro("Santo Antonio");
        endereco2.setCep("27310657");
        endereco2.setCidade("São Paulo");
        endereco2.setEstado("SP");
        endereco2.setLogradouro("Rua das Cajazeiras 26");
        endereco2.setNumero("243");
        pessoa2.setEndereco(endereco2);
        contrato2.setCadastro(pessoa2);
        contrato2.setEndereco(endereco);

        contratoRepository.gravar(contrato2);
    }


}
