package com.letscode.projetobiblioteca.cadastros;

import java.time.LocalDate;

import com.letscode.projetobiblioteca.emprestimo.Emprestimo;

public class CadastrarDevolucao implements com.letscode.projetobiblioteca.interfaces.Menus.Devolucao, com.letscode.projetobiblioteca.interfaces.Menus.DigitarDados {
    Emprestimo emprestimo;
    @Override
    public void devolver(){
        emprestimo.setDataDevolucao(LocalDate.now());
        if(emprestimo.getDataDevolucao().isAfter(emprestimo.getDataLimite())){
            // Query no banco para bloquear o usuário
            // "update usuario set suspensao = TRUE where cpf = '" + emprestimo.getUsuario().getCpf() + "';"
        }
        // Atualiza no banco de dados (emprestimo)
        // "update emprestimo set data_devolucao = '" + emprestimo.getDataDevolucao() + "' where id = " + emprestimo.getId() + ";"
    }

    @Override
    public void digitarDados(){
        String cpf = ColetarDados.coletaString("Insira seu CPF: ");
        // Query do banco de dados
        // "select * from emprestimo where cpf_usuario = '" + cpf + "' and data_devolucao = NULL;"
        // emprestimo = result.query
    }
}