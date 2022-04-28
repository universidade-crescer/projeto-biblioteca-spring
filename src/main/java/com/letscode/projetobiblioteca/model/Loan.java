package com.letscode.projetobiblioteca.model;

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
    @JoinColumn(name = "id_book")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "id_librarian")
    private Librarian librarian;

    @Column(name = "withdrawn_date")
    private LocalDate withdrawnDate;

    @Column(name = "return_date")
    private LocalDate returnDate;

    @Column(name = "deadline")
    private LocalDate deadline;

    @Column(name = "traffic_ticket")
    private Double trafficTicket ;

}
