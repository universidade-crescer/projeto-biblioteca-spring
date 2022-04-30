package com.letscode.projetobiblioteca.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "loan")
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @Column(name = "withdrawn_date")
    private LocalDate withdrawnDate;

    @Column(name = "return_date")
    private LocalDate returnDate;

    @Column(name = "deadline")
    private LocalDate deadline;

    @Column(name = "traffic_ticket")
    private Boolean trafficTicket;

    @JsonProperty("book_id")
    private void unpackNestedBook(Long book_id) {
        this.book = new Book();
        book.setId(book_id);
        book.getName();
        book.getYearOfPublication();
        book.getAuthor();
        book.getPublishingCompany();
        book.getQuantity();
    }

    @JsonProperty("student_id")
    private void unpackNestedStudent(Long student_id) {
        this.student = new Student();
        student.setId(student_id);
        student.getName();
        student.getPhone();
        student.getRegistration();
    }
}
