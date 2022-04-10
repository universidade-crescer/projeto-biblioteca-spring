package com.letscode.projetobiblioteca;

import com.letscode.projetobiblioteca.cadastros.*;
import com.letscode.projetobiblioteca.consultas.Consulta;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.InputMismatchException;
import java.util.Scanner;

@SpringBootApplication
@RequiredArgsConstructor
public class ProjetoBibliotecaApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ProjetoBibliotecaApplication.class, args);
    }

    Integer opcaoMenu = 1;
    Boolean erro = false;


    private final CadastrarUsuario cadastrarUsuario ;
    private final CadastrarLivro cadastrarLivro;
    private final Consulta consultar;
    private final CadastrarEmprestimo emprestimo;
    private final CadastrarDevolucao devolucao;
    private final RemoverUsuario remover;

    @Override
    public void run(String... args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {

            while (opcaoMenu != 0) {
                do {
                    erro = false;
                    try {
                        System.out.println("Sair....................0");
                        System.out.println("Cadastrar usuário.......1");
                        System.out.println("Cadastrar livro.........2");
                        System.out.println("Consultar livro.........3");
                        System.out.println("Empréstimo..............4");
                        System.out.println("Devolução...............5");
                        System.out.print("Remover usuário.........6\n-> ");
                        opcaoMenu = input.nextInt();
                    }catch (InputMismatchException e) {
                        erro = true;
                        System.out.println("Erro! Insira um número dentro do intervalo mostrado no menu.");
                        input.next();
                    }
                } while (erro || opcaoMenu < 0 && opcaoMenu > 5);
                switch (opcaoMenu) {
                    case 0:
                        break;
                    case 1:
                        cadastrarUsuario.digitarDados();
                        cadastrarUsuario.criacaoConta();
                        break;
                    case 2:
                        cadastrarLivro.digitarDados();
                        cadastrarLivro.criacaoLivro();
                        break;
                    case 3:
                        consultar.pegaList();
                        break;
                    case 4:
                        emprestimo.digitarDados();
                        emprestimo.emprestar();
                        break;
                    case 5:
                        devolucao.digitarDados();
                        devolucao.devolver();
                        break;
                    case 6:
                        remover.remover();
                        break;
                }
            }
        }
    }
}

