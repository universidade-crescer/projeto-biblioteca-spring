package com.letscode.projetobiblioteca.usuarios;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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
    private boolean suspensao;

    public Usuario(String cpf, String celular, String nome, String email) {
        this.cpf = cpf;
        this.celular = celular;
        this.nome = nome;
        this.email = email;
        this.numeroLivro = 1;
        this.suspensao = false;
    }

}