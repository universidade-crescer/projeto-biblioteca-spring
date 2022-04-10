package com.letscode.projetobiblioteca.consultas;


import com.letscode.projetobiblioteca.emprestimo.Livro;
import com.letscode.projetobiblioteca.interfaces.LivroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
@RequiredArgsConstructor
public class Consulta implements com.letscode.projetobiblioteca.interfaces.Menus.MenuConsultarLivro{
    private  Livro livro = new Livro();
    private final LivroRepository livroRepository;

    @Override
    public void procurarLivro() {
        System.out.print("Insira o nome do livro: ");
        Scanner s = new Scanner(System.in);
        String nomeLivro = s.nextLine();

        livro.setNome(nomeLivro);

        if(this.livroRepository.existsById(nomeLivro)){
            System.out.println("Nome do livro: " + this.livroRepository.findLivro(nomeLivro) +
                    " Quantidade: "+ this.livroRepository.findQuantidade(nomeLivro));
        }
        else{
            System.out.println("Livro não existe");
        }
    }

}
