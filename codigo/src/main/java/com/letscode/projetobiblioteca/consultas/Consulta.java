package com.letscode.projetobiblioteca.consultas;


import com.letscode.projetobiblioteca.cadastros.ColetarDados;
import com.letscode.projetobiblioteca.emprestimo.Livro;
import com.letscode.projetobiblioteca.usuarios.Usuario;

public class Consulta implements com.letscode.projetobiblioteca.interfaces.Menus.MenuConsultarLivro {

    @Override
    public Livro procurarLivro() {
        String nomeLivro = ColetarDados.coletaString("Insira o nome do livro: ");
        // coleta as informações da query do banco de dados ("select * from livro where nome = '" + nomeLivro + "';")
        // if(result != null)
        //      return new Livro(...)
        // return

        return null;
    }

    public Usuario procurarUsuario(){
        String cpfUsuario = ColetarDados.coletaString("Insira o CPF da pessoa a ser buscada: ");
        // coleta as informações da query do banco de dados ("select * from usuario where cpf = '" + cpfUsuario + "';")
        // if(result != null)
        //      return new Usuario(...)
        // return
        return null;
    }

}
