package com.letscode.projetobiblioteca.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

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
    private LocalDate withdrawnDate = LocalDate.now();

    @Column(name = "return_date")
    private Date returnDate;

    @Column(name = "deadline")
    private Date deadline;

    @Column(name = "traffic_ticket")
    private Boolean trafficTicket;
}
