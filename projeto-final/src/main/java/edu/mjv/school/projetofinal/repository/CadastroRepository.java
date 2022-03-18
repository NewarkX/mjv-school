package edu.mjv.school.projetofinal.repository;

import edu.mjv.school.projetofinal.model.Cadastro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadastroRepository extends JpaRepository<Cadastro,Integer> {

}
