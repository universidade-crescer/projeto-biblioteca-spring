package com.letscode.projetobiblioteca.controller;

import com.letscode.projetobiblioteca.model.Librarian;
import com.letscode.projetobiblioteca.model.Student;
import com.letscode.projetobiblioteca.service.LibrarianService;
import com.letscode.projetobiblioteca.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

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

    @PostMapping("/student")
    @ResponseStatus(HttpStatus.CREATED)
    public Student saveStudent(@RequestBody @Valid Student student){
        return this.studentService.saveStudent(student);
    }

    @GetMapping("/student")
    @ResponseStatus(HttpStatus.OK)
    public List<Student> getAllStudent(){
        return this.studentService.getAllStudent();
    }
}
