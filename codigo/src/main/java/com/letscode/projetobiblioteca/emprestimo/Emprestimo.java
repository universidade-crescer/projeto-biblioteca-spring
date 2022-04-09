package com.letscode.projetobiblioteca.emprestimo;

import java.time.LocalDate;


import com.letscode.projetobiblioteca.usuarios.Bibliotecario;
import com.letscode.projetobiblioteca.usuarios.Usuario;
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
public class Emprestimo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate dataRetirada;
    private LocalDate dataDevolucao;
    private LocalDate dataLimite;

    @ManyToOne
    @JoinColumn(name = "cpf_usuario", nullable = false)
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "id_livro", nullable = false)
    private Livro livro;
    @ManyToOne
    @JoinColumn(name = "id_bibliotecario", nullable = false)
    private Bibliotecario bibliotecario;

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


    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
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