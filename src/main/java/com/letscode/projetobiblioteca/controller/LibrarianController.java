package com.letscode.projetobiblioteca.controller;

import com.letscode.projetobiblioteca.model.Librarian;
import com.letscode.projetobiblioteca.model.Login;
import com.letscode.projetobiblioteca.model.Student;
import com.letscode.projetobiblioteca.service.LibrarianService;
import com.letscode.projetobiblioteca.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/librarian")
@Slf4j
public class LibrarianController {

    private final LibrarianService librarianService;
    private final StudentService studentService;

    public LibrarianController(LibrarianService librarianService, StudentService studentService) {
        this.librarianService = librarianService;
        this.studentService = studentService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Librarian> getAll() {
        return this.librarianService.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Librarian save(@RequestBody @Valid Librarian librarian) {
        return this.librarianService.save(librarian);
    }

    @PostMapping("/login")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity login(@RequestBody Login login, HttpServletResponse response) {
        return this.librarianService.login(login, response);
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Librarian> updateLibrarian(@PathVariable Long id, @RequestBody @Valid Librarian librarian) {
        return this.librarianService.updateLibrarian(id, librarian);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteLibrarian(@PathVariable Long id) {
        this.librarianService.deleteLibrarian(id);

    }

    @PostMapping("/student")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity saveStudent(@RequestBody @Valid Student student, @CookieValue("jwt") String jwt){
        return this.studentService.saveStudent(student, jwt);
    }

    @GetMapping("/student")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity getAllStudent(@CookieValue("jwt") String jwt){
        return this.studentService.getAllStudent(jwt);
    }
}
