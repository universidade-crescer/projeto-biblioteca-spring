package com.letscode.projetobiblioteca.usuarios;

import lombok.*;

import javax.persistence.Entity;

import javax.persistence.Id;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Bibliotecario {

    @Id
    private int id;
    private String nome;
    private String email;


    public Bibliotecario(Integer bibliotecarioId, String bibliotecarioEmail) {
        this.id = bibliotecarioId;
        this.email = bibliotecarioEmail;
    }
}