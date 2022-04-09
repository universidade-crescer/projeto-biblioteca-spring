package com.letscode.projetobiblioteca.cadastros;

import com.letscode.projetobiblioteca.consultas.Consulta;
import com.letscode.projetobiblioteca.interfaces.UsuarioRepository;
import com.letscode.projetobiblioteca.usuarios.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RemoverUsuario implements com.letscode.projetobiblioteca.interfaces.Menus.RemoveUsuario, com.letscode.projetobiblioteca.interfaces.Menus.DigitarDados {

    private String cpfUsuario;
    private Usuario usuario;
    private final UsuarioRepository usuarioRepository;

    @Override
    public void remover(){
        // Query do banco de dados
        // "delete from usuario where cpf = '" + this.usuario.getCpf() + "';"

        if(usuarioRepository.existsById(usuario.getCpf())){
            this.usuarioRepository.deleteById(cpfUsuario);
        }
        else{
            System.out.println("Usuário Inexistente");
        }

    }

    @Override
    public void digitarDados(){
        Consulta consulta = new Consulta();
        this.usuario.setCpf(consulta.procurarCpf());
    }
}
