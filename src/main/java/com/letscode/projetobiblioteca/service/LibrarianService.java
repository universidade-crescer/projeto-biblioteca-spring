package com.letscode.projetobiblioteca.service;

import com.letscode.projetobiblioteca.model.Librarian;
import com.letscode.projetobiblioteca.model.Login;
import com.letscode.projetobiblioteca.repository.LibrarianRepository;


import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


import javax.crypto.SecretKey;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Response;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class LibrarianService {

    private final LibrarianRepository librarianRepository;
    private final SecretKey CHAVE = Keys.hmacShaKeyFor(
            "7f-j&CKk=coNzZc0y7_4obMP?#TfcYq%fcD0mDpenW2nc!lfGoZ|d?f&RNbDHUX6"
                    .getBytes(StandardCharsets.UTF_8));


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

    public ResponseEntity login(Login login, HttpServletResponse response) {
        Librarian librarian = this.librarianRepository.findByEmail(login.getEmail());
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        Boolean password = bCryptPasswordEncoder.matches(login.getPassword(), librarian.getPassword());
        if (password) {
            String jwtToken = Jwts.builder()
                    .setSubject(login.getEmail())
                    .setIssuer("localhost:8080")
                    .setIssuedAt(new Date())
                    .setExpiration(
                            Date.from(
                                    LocalDateTime.now().plusMinutes(15L)
                                            .atZone(ZoneId.systemDefault())
                                            .toInstant()))
                    .signWith(CHAVE, SignatureAlgorithm.HS512)
                    .compact();

            Cookie cookie = new Cookie("jwt", jwtToken);

            response.addCookie(cookie);
            cookie.isHttpOnly();

            return ResponseEntity.ok("Sucess Login");
        }
        return ResponseEntity.badRequest().body("Invalid");
    }
}
