package com.letscode.projetobiblioteca.exception;

public class LibrarianRegisteredException extends RuntimeException{
    public LibrarianRegisteredException() {
        super("Librarian already exists");
    }
}
