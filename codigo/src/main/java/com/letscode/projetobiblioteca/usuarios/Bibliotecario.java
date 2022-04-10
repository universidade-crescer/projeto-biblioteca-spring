package com.letscode.projetobiblioteca.usuarios;


import com.letscode.projetobiblioteca.interfaces.BibliotecarioRepository;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Bibliotecario {

    @Id
    private int id;
    private String nome;
    private String email;


    public Bibliotecario(Integer bibliotecarioId, String bibliotecarioEmail) {
        this.id = bibliotecarioId;
        this.email = bibliotecarioEmail;
    }
}