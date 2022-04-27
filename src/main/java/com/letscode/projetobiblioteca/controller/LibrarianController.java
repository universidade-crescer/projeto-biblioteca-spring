package com.letscode.projetobiblioteca.controller;

import com.letscode.projetobiblioteca.model.Librarian;
import com.letscode.projetobiblioteca.service.LibrarianService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/librarian")
public class LibrarianController {

    private final LibrarianService librarianService;

    public LibrarianController(LibrarianService librarianService) {
        this.librarianService = librarianService;
    }

    @GetMapping
    public List<Librarian> getAll() {
        return this.librarianService.getAll();
    }


}
