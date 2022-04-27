package com.letscode.projetobiblioteca.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Librarian {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "phone")
    private String phone;
    
    @Column(name = "password")
    private String password;
}
