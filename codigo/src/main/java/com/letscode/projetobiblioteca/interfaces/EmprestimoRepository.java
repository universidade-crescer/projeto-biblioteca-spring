package com.letscode.projetobiblioteca.interfaces;

import com.letscode.projetobiblioteca.emprestimo.Emprestimo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmprestimoRepository extends JpaRepository<Emprestimo, Integer> {
}
