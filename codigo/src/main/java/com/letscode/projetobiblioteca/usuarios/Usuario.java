package com.biblioteca.src.usuarios;

public class Usuario {
    private String cpf;
    private String celular;
    private String nome;
    private String email;
    private int numeroLivro;
    private boolean suspensao;

    public Usuario() {
    }

    public Usuario(String cpf, String celular, String nome, String email) {
        this.cpf = cpf;
        this.celular = celular;
        this.nome = nome;
        this.email = email;
        this.numeroLivro = 1;
        this.suspensao = false;
    }

    public Usuario(String cpf, String celular, String nome, String email, int numeroLivro) {
        this.cpf = cpf;
        this.celular = celular;
        this.nome = nome;
        this.email = email;
        this.numeroLivro = numeroLivro;
        this.suspensao = false;
    }

    public Usuario(String cpf, String celular, String nome, String email, int numeroLivro, boolean suspensao) {
        this.cpf = cpf;
        this.celular = celular;
        this.nome = nome;
        this.email = email;
        this.numeroLivro = numeroLivro;
        this.suspensao = suspensao;
    }

    @Override
    public String toString() {
        return "Usuario [celular=" + celular + ", cpf=" + cpf + ", email=" + email + ", nome=" + nome + ", numeroLivro="
                + numeroLivro + ", suspensao=" + suspensao + "]";
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumeroLivro() {
        return numeroLivro;
    }

    public void setNumeroLivro(int numeroLivro) {
        this.numeroLivro = numeroLivro;
    }

    public boolean isSuspensao() {
        return suspensao;
    }

    public void setSuspensao(boolean suspensao) {
        this.suspensao = suspensao;
    }

}