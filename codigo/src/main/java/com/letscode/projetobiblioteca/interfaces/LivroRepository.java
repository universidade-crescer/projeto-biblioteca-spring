package com.letscode.projetobiblioteca.interfaces;

import com.letscode.projetobiblioteca.emprestimo.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface LivroRepository extends JpaRepository<Livro, String> {

    @Query("select l.nome from Livro l where l.nome=?1 and l.quantidade>=1")
    String findLivro(String nome);

    @Query("select l.quantidade from Livro l where l.nome=?1 and l.quantidade>=1")
    Integer findQuantidade(String nome);

    @Modifying
    @Query("update Livro l set l.quantidade = l.quantidade-1 where l.nome=?1")
    void diminuirQuantidade(String nome);

    @Modifying
    @Query("update Livro l set l.quantidade = l.quantidade+1 where l.nome=?1")
    void aumentarQuantidade(String nome);

    @Query("select l.nome from Livro l where l.nome=?1")
    String pegaNome(String nome);
}
