package com.biblioteca.src.emprestimo;

import java.time.LocalDate;

import com.biblioteca.src.usuarios.Bibliotecario;
import com.biblioteca.src.usuarios.Usuario;

public class Emprestimo {

    private int id;
    private LocalDate dataRetirada;
    private LocalDate dataDevolucao;
    private LocalDate dataLimite;
    private Usuario usuario;
    private Livro livro;
    private Bibliotecario bibliotecario;

    public Emprestimo() {
    }

    public Emprestimo(LocalDate dataRetirada, LocalDate dataLimite) {
        this.id = 0;
        this.dataRetirada = dataRetirada;
        this.dataLimite = dataLimite;
        this.dataDevolucao = null;
        this.bibliotecario = null;
        this.usuario = null;
        this.livro = null;
    }

    public Emprestimo(int id, LocalDate dataRetirada, LocalDate dataLimite, LocalDate dataDevolucao, Usuario usuario, Livro livro, Bibliotecario bibliotecario) {
        this.id = id;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
        this.dataLimite = dataLimite;
        this.usuario = usuario;
        this.bibliotecario = bibliotecario;
        this.livro = livro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(LocalDate dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public LocalDate getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(LocalDate dataLimite) {
        this.dataLimite = dataLimite;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }

    

}