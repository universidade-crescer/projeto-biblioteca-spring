package com.letscode.projetobiblioteca.repository;

import com.letscode.projetobiblioteca.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Long> {

}
