package com.letscode.projetobiblioteca.cadastros;

import java.time.LocalDate;
import java.util.Scanner;

import com.letscode.projetobiblioteca.emprestimo.Emprestimo;
import com.letscode.projetobiblioteca.emprestimo.Livro;
import com.letscode.projetobiblioteca.interfaces.EmprestimoRepository;
import com.letscode.projetobiblioteca.interfaces.LivroRepository;
import com.letscode.projetobiblioteca.interfaces.UsuarioRepository;
import com.letscode.projetobiblioteca.usuarios.Bibliotecario;
import com.letscode.projetobiblioteca.usuarios.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CadastrarDevolucao implements com.letscode.projetobiblioteca.interfaces.Menus.Devolucao, com.letscode.projetobiblioteca.interfaces.Menus.DigitarDados {
    private Emprestimo emprestimo;
    private Bibliotecario bibliotecario;
    private Usuario usuario;
    private Livro livro;

    private final EmprestimoRepository emprestimoRepository;
    private final UsuarioRepository usuarioRepository;
    private final LivroRepository livroRepository;

    Scanner s = new Scanner(System.in);

    @Override
    public void devolver(){
        livro = new Livro(emprestimoRepository.devolveNomeLivro(usuario.getCpf()));
        this.emprestimo = new Emprestimo(livro, usuario, new Bibliotecario(),
                emprestimoRepository.devolveDataRetirada(usuario.getCpf()),LocalDate.now(), emprestimoRepository.devolveDataLimite(usuario.getCpf()));

        if(emprestimo.getDataDevolucao().isAfter(emprestimo.getDataLimite())){
            usuarioRepository.aplicarSuspensao(usuario.getCpf());
        }
        livroRepository.aumentarQuantidade(livro.getNome());
        emprestimoRepository.devolucao(usuario.getCpf());
    }

    @Override
    public void digitarDados(){
        usuario = new Usuario();

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