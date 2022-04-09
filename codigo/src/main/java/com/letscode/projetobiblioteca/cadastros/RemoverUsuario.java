package com.letscode.projetobiblioteca.cadastros;

import com.letscode.projetobiblioteca.consultas.Consulta;
import com.letscode.projetobiblioteca.usuarios.Usuario;


public class RemoverUsuario implements com.letscode.projetobiblioteca.interfaces.Menus.RemoveUsuario, com.letscode.projetobiblioteca.interfaces.Menus.DigitarDados {
    Usuario usuario;
    @Override
    public void remover(){
        // Query do banco de dados
        // "delete from usuario where cpf = '" + this.usuario.getCpf() + "';"
    }

    @Override
    public void digitarDados(){
        Consulta consulta = new Consulta();
        this.usuario = consulta.procurarUsuario();
    }
}
