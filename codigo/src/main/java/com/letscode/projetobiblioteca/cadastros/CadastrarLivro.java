package com.letscode.projetobiblioteca.cadastros;

import com.letscode.projetobiblioteca.emprestimo.Livro;

public class CadastrarLivro implements com.letscode.projetobiblioteca.interfaces.Menus.MenuCadastrarLivro, com.letscode.projetobiblioteca.interfaces.Menus.DigitarDados {
    private Livro livro;

    @Override
    public void criacaoLivro() {
        System.out.println(this.livro.toString());
        // TODO banco de dados
        // "insert into livro values(livro.getId(), livro.getNome(), livro.getAutor(), livro.getAno(), livro.getEditora(), livro.getQuantidade())"
    }

    @Override
    public void digitarDados() {
        this.livro = new Livro(
                ColetarDados.coletaString("Nome: "),
                ColetarDados.coletaInteger("Ano: ", -2000, 2022),
                ColetarDados.coletaString("Autor: "),
                ColetarDados.coletaString("Editora: "),
                ColetarDados.coletaInteger("Insira a quantidade de exemplares: ", 1, 100)
                );

    }

}