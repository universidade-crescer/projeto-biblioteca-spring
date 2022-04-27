package com.letscode.projetobiblioteca.repository;

import com.letscode.projetobiblioteca.model.Librarian;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibrarianRepository extends JpaRepository<Librarian, Long> {
}
