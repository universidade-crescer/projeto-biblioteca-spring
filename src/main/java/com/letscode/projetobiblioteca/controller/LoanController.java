package com.letscode.projetobiblioteca.controller;

import com.letscode.projetobiblioteca.model.Loan;
import com.letscode.projetobiblioteca.service.LoanService;

import java.util.List;

@RestController
@RequestMapping("/loan")
public class LoanController {
    private final LoanService loanService;

    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Loan> getAll() {
        return this.loanService.getAll();
    }

}
