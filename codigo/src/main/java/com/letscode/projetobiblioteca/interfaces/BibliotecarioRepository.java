package com.letscode.projetobiblioteca.interfaces;

import com.letscode.projetobiblioteca.usuarios.Bibliotecario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BibliotecarioRepository extends JpaRepository<Bibliotecario, Integer> {

    @Query("select b.id from Bibliotecario b where b.nome=?1")
    Integer findBibliotecarioId(String nome);

    @Query("select b.nome from Bibliotecario b where b.nome=?1")
    String findBibliotecarioNome(String nome);

    @Query("select b.email from Bibliotecario b where b.nome=?1")
    String findBibliotecarioEmail(String nome);

}
