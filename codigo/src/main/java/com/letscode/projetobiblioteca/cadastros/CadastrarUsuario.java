package src.cadastros;

import src.usuarios.Usuario;

public class CadastrarUsuario implements src.interfaces.Menus.MenuCadastrarUsuario, src.interfaces.Menus.DigitarDados{
    private Usuario usuario;

    @Override
    public void criacaoConta() {
        System.out.println(this.usuario.toString());
        // TODO
        // "insert into usuario values(usuario.getCpf(), usuario.getNome(), usuario.getEmail(), usuario.getCelular(), usuario.getsuspensao(), usuario.getNumeroLivro());"
    }

    @Override
    public void digitarDados() {
            this.usuario = new Usuario(
            ColetarDados.coletaString("CPF: "),
            ColetarDados.coletaString("Celular: "),
            ColetarDados.coletaString("Nome: "),
            ColetarDados.coletaString("Email: "));
    }

}
