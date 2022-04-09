package com.letscode.projetobiblioteca.cadastros;

import java.time.LocalDate;

import com.letscode.projetobiblioteca.emprestimo.Emprestimo;
import com.letscode.projetobiblioteca.interfaces.EmprestimoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CadastrarDevolucao implements com.letscode.projetobiblioteca.interfaces.Menus.Devolucao, com.letscode.projetobiblioteca.interfaces.Menus.DigitarDados {
    private Emprestimo emprestimo;
    private  final EmprestimoRepository emprestimoRepository;

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