package com.letscode.projetobiblioteca.interfaces;

import com.letscode.projetobiblioteca.emprestimo.Emprestimo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface EmprestimoRepository extends JpaRepository<Emprestimo, Integer> {

    @Modifying
    @Query("update Emprestimo e set e.dataDevolucao=current_date where e.usuario.cpf=?1")
    void devolucao(String cpfUsuario);

    @Query("select e.livro.nome from Emprestimo e where e.usuario.cpf=?1 and e.dataDevolucao is null")
    String devolveNomeLivro(String cpfUsuario);

    @Query("select e.dataRetirada from Emprestimo e where e.usuario.cpf=?1 and e.dataDevolucao is null")
    LocalDate devolveDataRetirada(String cpfUsuario);

    @Query("select e.dataLimite from Emprestimo e where e.usuario.cpf=?1 and e.dataDevolucao is null")
    LocalDate devolveDataLimite(String cpfUsuario);

}
