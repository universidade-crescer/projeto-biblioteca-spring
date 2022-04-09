package com.biblioteca.src.emprestimo;

public class Livro {
    private Integer id;
    private String nome;
    private Integer anoPublicacao;
    private String autor;
    private String editora;
    private Integer quantidade;

    public Livro() {
    }

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Integer anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}