package com.letscode.projetobiblioteca.service;

import com.letscode.projetobiblioteca.model.Librarian;
import com.letscode.projetobiblioteca.repository.LibrarianRepository;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class LibrarianService {

    private final LibrarianRepository librarianRepository;


    public LibrarianService(LibrarianRepository librarianRepository) {
        this.librarianRepository = librarianRepository;
    }

    public List<Librarian> getAll() {
        return this.librarianRepository.findAll();
    }

    public Librarian save(Librarian librarian) {
        BCryptPasswordEncoder bcryp = new BCryptPasswordEncoder();
        librarian.setPassword(bcryp.encode(librarian.getPassword()));
        return this.librarianRepository.save(librarian);
    }


    public Librarian findByEmail(String email) {
        return this.librarianRepository.findByEmail(email);
    }

    public Optional<Librarian> updateLibrarian(Long id, Librarian librarian) {
        return this.librarianRepository.findById(id)
                .map(saveLibrarian -> {
                    saveLibrarian.setName(librarian.getName());
                    saveLibrarian.setPassword(librarian.getPassword());
                    saveLibrarian.setEmail(librarian.getEmail());
                    saveLibrarian.setPhone(librarian.getPhone());
                    Librarian newLibrarian = librarianRepository.save(saveLibrarian);
                    return newLibrarian;
                });
    }

    public void deleteLibrarian(Long id) {
        this.librarianRepository.deleteById(id);
    }
}
