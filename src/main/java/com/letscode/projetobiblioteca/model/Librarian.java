package com.letscode.projetobiblioteca.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "librarian")
public class Librarian {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    @NotBlank(message = "Write your name.")
    private String name;

    @Column(name = "email")
    @NotBlank(message = "Write your email.")
    private String email;

    @Column(name = "cpf")
    @NotBlank(message = "Write your cpf.")
    private String cpf;

    @Column(name = "phone")
    @NotBlank(message = "Write your phone number.")
    private String phone;

    @Column(name = "password")
    @NotBlank(message = "Write your password.")
    private String password;
}
