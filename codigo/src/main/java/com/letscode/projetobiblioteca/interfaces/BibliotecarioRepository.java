package com.letscode.projetobiblioteca.interfaces;

import com.letscode.projetobiblioteca.usuarios.Bibliotecario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BibliotecarioRepository extends JpaRepository<Bibliotecario, Integer> {
}
