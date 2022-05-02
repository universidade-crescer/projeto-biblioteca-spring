package com.letscode.projetobiblioteca.controller;


import com.letscode.projetobiblioteca.exception.TicketTrafficException;
import com.letscode.projetobiblioteca.model.Loan;
import com.letscode.projetobiblioteca.service.LoanService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

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

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Loan saveLoan (@RequestBody @Valid Loan loan){
        return this.loanService.saveLoan(loan);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Loan> updateLoan(@PathVariable Long id, @RequestBody @Valid Loan loan){
        return this.loanService.updateLoan(id, loan);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteLoan(@PathVariable Long id){
        this.loanService.deleteLoan(id);
    }

    @ExceptionHandler
    public ResponseEntity ticketTrafficDeadline(TicketTrafficException e){
        ResponseEntity response = new ResponseEntity(e.getMessage(),HttpStatus.CONFLICT);
        return response;
    }

}

