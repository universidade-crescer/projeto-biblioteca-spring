package com.letscode.projetobiblioteca.usuarios;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
public class Usuario {

    @Id
    private String cpf;
    private String celular;
    private String nome;
    private String email;
    private int numeroLivro;
    private int suspensao;

    public Usuario(String cpf, String celular, String nome, String email) {
        this.cpf = cpf;
        this.celular = celular;
        this.nome = nome;
        this.email = email;
        this.numeroLivro = 1;
        this.suspensao = 0;
    }

    public Usuario(String cpf, String celular, String nome, String email, int numeroLivro) {
        this.cpf = cpf;
        this.celular = celular;
        this.nome = nome;
        this.email = email;
        this.numeroLivro = numeroLivro;
        this.suspensao = 0;
    }

    public Usuario(String cpf, String celular, String nome, String email, int numeroLivro, int suspensao) {
        this.cpf = cpf;
        this.celular = celular;
        this.nome = nome;
        this.email = email;
        this.numeroLivro = numeroLivro;
        this.suspensao = 0;
    }


}