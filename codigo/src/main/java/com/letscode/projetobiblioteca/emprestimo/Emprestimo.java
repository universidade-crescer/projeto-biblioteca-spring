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





//    public Emprestimo(LocalDate dataRetirada, LocalDate dataLimite) {
//        this.id = 0;
//        this.dataRetirada = dataRetirada;
//        this.dataLimite = dataLimite;
//        this.dataDevolucao = null;
//        this.bibliotecario = null;
//        this.usuario = null;
//        this.livro = null;
//    }




}