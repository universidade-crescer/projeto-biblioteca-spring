package com.letscode.projetobiblioteca.service;

import com.letscode.projetobiblioteca.model.Loan;
import com.letscode.projetobiblioteca.repository.LoanRepository;

import java.util.List;

@Service
public class LoanService {
    private final LoanRepository loanRepository;

    public LoanService(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;

    }

    public List<Loan> getAll () {
        return this.loanRepository.findAll();

    }
}
