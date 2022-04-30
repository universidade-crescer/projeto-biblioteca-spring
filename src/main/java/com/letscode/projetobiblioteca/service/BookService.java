package com.letscode.projetobiblioteca.service;

import com.letscode.projetobiblioteca.model.Book;
import com.letscode.projetobiblioteca.repository.BookRepository;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAll() {
        return this.bookRepository.findAll();
    }

    public Book saveBook(Book book) {
        return this.bookRepository.save(book);
    }

    public Optional<Book> updateBook(Long id, Book book) {
        return this.bookRepository.findById(id)
                .map(save -> {
                    save.setQuantity(book.getQuantity());
                    Book newQuantity = bookRepository.save(save);
                    return newQuantity;
                });

    }

    public void deleteBook(Long id) {
        this.bookRepository.deleteById(id);
    }
}

