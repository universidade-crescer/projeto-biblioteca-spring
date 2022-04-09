package com.letscode.projetobiblioteca.emprestimo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private Integer anoPublicacao;
    private String autor;
    private String editora;
    private Integer quantidade;

    public Livro(String nome, Integer anoPublicacao, String autor, String editora, Integer quantidade) {
        this.id = -1;
        this.nome = nome;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
        this.editora = editora;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Livro [anoPublicacao=" + anoPublicacao + ", autor=" + autor + ", editora=" + editora + ", id=" + id
                + ", nome=" + nome + ", quantidade=" + quantidade + "]";
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Livro(Integer id, String nome, Integer anoPublicacao, String autor, String editora) {
        this.id = id;
        this.nome = nome;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
        this.editora = editora;
    }

}