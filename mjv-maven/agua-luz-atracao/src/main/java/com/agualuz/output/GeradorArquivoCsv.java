package com.agualuz.output;

import com.agualuz.model.Contrato;

import java.io.File;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class GeradorArquivoCsv {
    public void gerarArquivo(List<Contrato> contratos){
        StringBuilder conteudo = new StringBuilder();
        for(Contrato ct: contratos){
            conteudo.append(ct.getCadastro().getNome().concat(";").concat(ct.getCadastro().getCpf()));
            conteudo.append("\n");
        }
        System.out.println(conteudo.toString());

        File output = new File("C:\\Users\\User\\Desktop\\mjv-school\\mjv-maven\\agua-luz-atracao");
        if(!output.exists())
            output.mkdirs();

        Path path = Paths.get("C:\\Users\\User\\Desktop\\mjv-school\\mjv-maven\\agua-luz-atracao\\agua-luz-contratos.txt");

        try {
            Files.write(path, conteudo.toString().getBytes(StandardCharsets.UTF_8));
        } catch (IOException e){
            e.getStackTrace();
        }

    }
}
