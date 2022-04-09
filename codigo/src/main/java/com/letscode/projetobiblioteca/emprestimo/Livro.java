package com.projeto.backup.codigo.emprestimo;


import lombok.*;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Livro {
    private Integer id;
    private String nome;
    private Integer anoPublicacao;
    private String autor;
    private String editora;

    public Livro(String nome, Integer anoPublicacao, String autor, String editora) {
        this.id = -1;
        this.nome = nome;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
        this.editora = editora;
    }

}