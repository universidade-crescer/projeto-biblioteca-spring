package com.letscode.projetobiblioteca.exception;

public class BookNotAvailableException extends RuntimeException{
    public BookNotAvailableException() {
        super("Book it is not available in the system.");
    }
}
