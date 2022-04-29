package com.letscode.projetobiblioteca.controller;

import com.letscode.projetobiblioteca.model.Loan;
import com.letscode.projetobiblioteca.service.LoanService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/loan")
@Slf4j
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
