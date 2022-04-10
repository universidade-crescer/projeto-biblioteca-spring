package com.letscode.projetobiblioteca.cadastros;

import com.letscode.projetobiblioteca.consultas.Consulta;
import com.letscode.projetobiblioteca.interfaces.UsuarioRepository;
import com.letscode.projetobiblioteca.usuarios.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
@RequiredArgsConstructor
public class RemoverUsuario implements com.letscode.projetobiblioteca.interfaces.Menus.RemoveUsuario{
    private final UsuarioRepository usuarioRepository;

    @Override
    public void remover(){
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o CPF: ");
        String cpf = s.next();
        if(this.usuarioRepository.existsById(cpf)){
            this.usuarioRepository.deleteById(cpf);
        }else{
            System.out.println("Deu erro!");
        }
    }

}
