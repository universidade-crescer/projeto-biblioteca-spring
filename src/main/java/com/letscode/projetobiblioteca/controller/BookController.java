package com.letscode.projetobiblioteca.controller;

import com.letscode.projetobiblioteca.exception.BookNotFoundException;
import com.letscode.projetobiblioteca.model.Book;
import com.letscode.projetobiblioteca.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
@Slf4j
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Book> getAll() {
        return this.bookService.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Book saveBook(@RequestBody @Valid Book book){
        return this.bookService.saveBook(book);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Book> updateBooks(@PathVariable Long id, @RequestBody @Valid Book book){
        return this.bookService.updateBook(id, book);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBook(@PathVariable Long id){
        this.bookService.deleteBook(id);
    }

    @ExceptionHandler
    public ResponseEntity bookNotFound(BookNotFoundException e){
        ResponseEntity response = new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
        return response;
    }
}
