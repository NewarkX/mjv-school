package com.livro;

import com.livro.model.Livro;
import com.livro.repositories.LivroRepository;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        LivroRepository livroRepository = new LivroRepository();
        Livro livro1 = new Livro();
        livro1.setNome("A bela e a fera");
        livro1.setAutor("Gabrielle-Suzanne Barbot");
        livro1.setEdicao("1");
        livro1.setCategoria("fantasia");
        livro1.setValor(20.00);
        livroRepository.save(livro1);

        Livro livro2 = new Livro();
        livro2.setNome("O chamado dos unown");
        livro2.setAutor("Willian");
        livro2.setEdicao("1");
        livro2.setCategoria("fantasia");
        livro2.setValor(23.00);
        livroRepository.save(livro2);

        Livro livro = livroRepository.findById(1);
        if(livro != null){
            System.out.println(livro.getNome());
            System.out.println(livro);
        }

        List<Livro> livros = livroRepository.findAll();
            for(Livro l : livros) {
                System.out.println(l);
            }
    }
}
