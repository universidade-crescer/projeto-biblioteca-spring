package com.letscode.projetobiblioteca.interfaces;

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
        void procurarLivro();
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
