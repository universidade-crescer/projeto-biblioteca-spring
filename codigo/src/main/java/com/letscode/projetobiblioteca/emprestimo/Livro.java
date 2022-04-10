package com.letscode.projetobiblioteca.emprestimo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
public class Livro {
    @Id
    private String nome;
    private Integer anoPublicacao;
    private String autor;
    private String editora;
    private Integer quantidade;

    public Livro(String nome, Integer anoPublicacao, String autor, String editora, Integer quantidade) {
        this.nome = nome;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
        this.editora = editora;
        this.quantidade = quantidade;
    }


}