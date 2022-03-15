package com.livro.repositories;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class LivroRepository {
    private EntityManager em;

    public LivroRepository(){
        EntityManagerFactory entityManagerFactory
             = Persistence.createEntityManagerFactory("LIVROS_PU");
        em =  entityManagerFactory.createEntityManager();
    }
}
