package com.letscode.projetobiblioteca.cadastros;

import java.time.LocalDate;
import java.util.Scanner;

import com.letscode.projetobiblioteca.emprestimo.Emprestimo;
import com.letscode.projetobiblioteca.emprestimo.Livro;
import com.letscode.projetobiblioteca.interfaces.EmprestimoRepository;
import com.letscode.projetobiblioteca.interfaces.LivroRepository;
import com.letscode.projetobiblioteca.interfaces.UsuarioRepository;
import com.letscode.projetobiblioteca.usuarios.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CadastrarDevolucao implements com.letscode.projetobiblioteca.interfaces.Menus.Devolucao, com.letscode.projetobiblioteca.interfaces.Menus.DigitarDados {
    private Emprestimo emprestimo;
    private Usuario usuario;
    private Livro livr;

    private final EmprestimoRepository emprestimoRepository;
    private final UsuarioRepository usuarioRepository;
    private final LivroRepository livroRepository;

    Scanner s = new Scanner(System.in);

    @Override
    public void devolver(){
        emprestimo.setDataDevolucao(LocalDate.now());
        if(emprestimo.getDataDevolucao().isAfter(emprestimo.getDataLimite())){
            // Query no banco para bloquear o usuário
            // "update usuario set suspensao = TRUE where cpf = '" + emprestimo.getUsuario().getCpf() + "';"

        }else{

        }
        // Atualiza no banco de dados (emprestimo)
        // "update emprestimo set data_devolucao = '" + emprestimo.getDataDevolucao() + "' where id = " + emprestimo.getId() + ";"

    }

    @Override
    public void digitarDados(){
        Usuario usuario = new Usuario();

        System.out.println("Digite o CPF do usuário: ");
        String cpfUsuario = s.nextLine();
        if(usuarioRepository.existsById(cpfUsuario)) {
            usuario.setCpf(cpfUsuario);
        }
        else{
            System.out.println("Usuário não cadastrado");
        }
    }
}