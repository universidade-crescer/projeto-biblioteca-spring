package com.letscode.projetobiblioteca.model;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name_book")
    private String name;

    @Column(name = "year_of_publication")
    private Integer yearOfPublication;

    @Column(name = "author")
    private String author;

    @Column(name = "publishing_company")
    private String publishingCompany;

    @Column(name = "quantity")
    private Integer quantity;
}
