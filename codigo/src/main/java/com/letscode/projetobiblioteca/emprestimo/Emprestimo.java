package com.letscode.projetobiblioteca.emprestimo;

import java.time.LocalDate;


import com.letscode.projetobiblioteca.usuarios.Bibliotecario;
import com.letscode.projetobiblioteca.usuarios.Usuario;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Emprestimo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    @JoinColumn(name = "id_livro")
    private Livro livro;
    @ManyToOne
    @JoinColumn(name = "cpf_usuario")
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "id_bibliotecario")
    private Bibliotecario bibliotecario;
    private LocalDate dataRetirada;
    private LocalDate dataDevolucao;
    private LocalDate dataLimite;

    public Emprestimo(Livro livro, Usuario usuario, Bibliotecario bibliotecario, LocalDate dataRetirada, LocalDate dataDevolucao, LocalDate dataLimite) {
        this.livro = livro;
        this.usuario = usuario;
        this.bibliotecario = bibliotecario;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
        this.dataLimite = dataLimite;
    }

}