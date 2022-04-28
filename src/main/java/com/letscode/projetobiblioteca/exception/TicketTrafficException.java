package com.letscode.projetobiblioteca.exception;

public class TicketTrafficException extends RuntimeException{
    public TicketTrafficException() {
        super("Your deadline its over, pay the ticket traffic!");
    }
}
