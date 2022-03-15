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
//      Livro livro = new Livro();
//      livro.setNome("A bela e a fera");
//      livro.setAutor("Gabrielle-Suzanne Barbot");
//      livro.setEdicao("1");
//      livroRepository.save(livro);

//        Livro livro = livroRepository.findById(1);
//        if(livro != null){
//            System.out.println(livro.getNome());
//            System.out.println(livro);
//        }

        List<Livro> livros = livroRepository.findAll();
        for (Livro l: livros){
            System.out.println(l);
        }
    }
}
