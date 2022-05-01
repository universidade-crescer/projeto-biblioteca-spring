package com.letscode.projetobiblioteca.service;


import com.letscode.projetobiblioteca.model.Loan;
import com.letscode.projetobiblioteca.repository.BookRepository;
import com.letscode.projetobiblioteca.repository.LoanRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoanService {
    private final LoanRepository loanRepository;


    public LoanService(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    public List<Loan> getAll () {
        return this.loanRepository.findAll();

    }

    public Loan saveLoan(Loan loan) {
        return this.loanRepository.save(loan);
    }

    public Optional<Loan> updateLoan(Long id, Loan loan) {
        return this.loanRepository.findById(id)
                .map(saveLoan -> {
                    saveLoan.setTrafficTicket(loan.getTrafficTicket());
                    Loan newLoan = loanRepository.save(saveLoan);
                    return newLoan;
                });
    }

    public void deleteLoan(Long id) {
        this.loanRepository.deleteById(id);
    }
}
