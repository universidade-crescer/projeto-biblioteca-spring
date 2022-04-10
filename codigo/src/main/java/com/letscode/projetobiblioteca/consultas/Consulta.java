package com.letscode.projetobiblioteca.consultas;


import com.letscode.projetobiblioteca.emprestimo.Livro;
import com.letscode.projetobiblioteca.interfaces.LivroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class Consulta implements com.letscode.projetobiblioteca.interfaces.Menus.MenuConsultarLivro {
    private Livro livro;
    private LivroRepository livroRepository;

    @Override
    public Livro procurarLivro() {
//        System.out.print("Insira o nome do livro: ");
//        Scanner s = new Scanner(System.in);
//        String nomeLivro = s.next();
        return null;
    }

    public void pegaList(){
        try {
            System.out.println(livroRepository.findLivroByNome("teste"));
        }catch (Exception e){
            System.out.println("socorro");
        }
    }

}
