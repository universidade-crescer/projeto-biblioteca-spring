package com.letscode.projetobiblioteca.service;

import com.letscode.projetobiblioteca.model.Librarian;
import com.letscode.projetobiblioteca.repository.LibrarianRepository;

import java.util.List;

public class LibrarianService {

    private final LibrarianRepository librarianRepository;

    public LibrarianService(LibrarianRepository librarianRepository) {
        this.librarianRepository = librarianRepository;
    }

    public List<Librarian> getAll() {
        return this.librarianRepository.findAll();
    }
}
