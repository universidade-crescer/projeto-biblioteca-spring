package src.cadastros;

import src.consultas.Consulta;
import src.usuarios.Usuario;

public class RemoverUsuario implements src.interfaces.Menus.RemoveUsuario, src.interfaces.Menus.DigitarDados {
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
