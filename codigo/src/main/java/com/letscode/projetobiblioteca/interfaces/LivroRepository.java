package com.letscode.projetobiblioteca.interfaces;

import com.letscode.projetobiblioteca.emprestimo.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer> {
}
