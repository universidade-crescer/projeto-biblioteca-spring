package com.letscode.projetobiblioteca.interfaces;


import com.letscode.projetobiblioteca.emprestimo.Livro;

public interface Menus {

    interface DigitarDados {
        void digitarDados();
    }

    interface MenuCadastrarUsuario {
        void criacaoConta();
    }

    interface MenuCadastrarLivro {
        void criacaoLivro();
    }

    interface MenuConsultarLivro {
        Livro procurarLivro();
    }

    interface MenuEmprestimo {
        void emprestar();
    }

    interface Devolucao {
        void devolver();
    }

    interface RemoveUsuario {
        void remover();
    }
}
