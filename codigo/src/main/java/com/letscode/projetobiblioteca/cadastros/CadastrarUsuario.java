package com.letscode.projetobiblioteca.cadastros;

import com.letscode.projetobiblioteca.interfaces.UsuarioRepository;
import com.letscode.projetobiblioteca.usuarios.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CadastrarUsuario implements com.letscode.projetobiblioteca.interfaces.Menus.MenuCadastrarUsuario,com.letscode.projetobiblioteca.interfaces.Menus.DigitarDados{
    private Usuario usuario;
    private final UsuarioRepository usuarioRepository;

    @Override
    public void criacaoConta() {
        System.out.println(this.usuario.toString());
        // TODO
        // "insert into usuario values(usuario.getCpf(), usuario.getNome(), usuario.getEmail(), usuario.getCelular(), usuario.getsuspensao(), usuario.getNumeroLivro());"
        if(!usuarioRepository.existsById(usuario.getCpf())){
            this.usuarioRepository.save(usuario);
        }
        else{
            System.out.println("Já cadastrado");
        }
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
