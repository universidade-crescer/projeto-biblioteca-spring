package com.letscode.projetobiblioteca.controller;

import com.letscode.projetobiblioteca.model.Librarian;
import com.letscode.projetobiblioteca.service.LibrarianService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/librarian")
public class LibrarianController {

    private final LibrarianService librarianService;

    public LibrarianController(LibrarianService librarianService) {
        this.librarianService = librarianService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Librarian> getAll() {
        return this.librarianService.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Librarian save(@RequestBody Librarian librarian) {
        return this.librarianService.save(librarian);
    }


}
