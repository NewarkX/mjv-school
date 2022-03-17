package edu.mjv.school.projetofinal.controllers;

import edu.mjv.school.projetofinal.model.Cadastro;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cadastros")
public class CadastroController {

    @GetMapping
    public List<Cadastro> listar(){
        System.out.println("listando dados");
        return null;
    }

    @GetMapping("/filtro/")
    public List<Cadastro> filtrar(@RequestParam("nm") String nome){
        System.out.println("listando dados pelo nome: " + nome);
        return null;
    }

    @PostMapping
    public void gravar(@RequestBody Cadastro cadastro){
        System.out.println("salvando dados");
        System.out.println(cadastro);
    }

    @PutMapping
    public void alterar(@RequestBody Cadastro cadastro){
        System.out.println("alterando dados");
        System.out.println(cadastro);
    }

    @DeleteMapping(value = "{id}")
    public void excluir(@PathVariable Integer id){
        System.out.println("excluindo dado");
        System.out.println("id: " + id);
    }
}
