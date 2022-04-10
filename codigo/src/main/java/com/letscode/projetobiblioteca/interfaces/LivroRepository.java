package com.letscode.projetobiblioteca.interfaces;

import com.letscode.projetobiblioteca.emprestimo.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LivroRepository extends JpaRepository<Livro, String> {

    @Query("select l.nome from Livro l where l.nome= ?1")
    public Livro findLivroByNome(String nome);

}
