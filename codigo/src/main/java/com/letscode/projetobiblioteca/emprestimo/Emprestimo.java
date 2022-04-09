package com.projeto.backup.codigo.emprestimo;

import lombok.*;

import java.time.LocalDate;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Emprestimo {

    private int id;
    private LocalDate dataRetirada;
    private LocalDate dataDevolucao;
    private LocalDate dataLimite;

}