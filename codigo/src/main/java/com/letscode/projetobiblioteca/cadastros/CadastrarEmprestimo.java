package com.letscode.projetobiblioteca.cadastros;

import com.letscode.projetobiblioteca.consultas.Consulta;
import com.letscode.projetobiblioteca.emprestimo.Emprestimo;
import com.letscode.projetobiblioteca.emprestimo.Livro;
import com.letscode.projetobiblioteca.interfaces.EmprestimoRepository;
import com.letscode.projetobiblioteca.usuarios.Bibliotecario;
import com.letscode.projetobiblioteca.usuarios.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

@Service
@RequiredArgsConstructor
public class CadastrarEmprestimo implements com.letscode.projetobiblioteca.interfaces.Menus.MenuEmprestimo, com.letscode.projetobiblioteca.interfaces.Menus.DigitarDados {
    private Emprestimo emprestimo;
    private  final EmprestimoRepository emprestimoRepository;



    public void criacaoEmprestimo() {
        // TODO
        // "insert into emprestimo values(emprestimo.getId(), emprestimo.getIdLivro(), emprestimo.getCpf(), emprestimo.getIdBibliotecario(), emprestimo.getDataRetirada(), emprestimo.getDataDevolucao(), emprestimo.getDataLimite())"
    }

    @Override
    public void emprestar(){
        LocalDate hoje = LocalDate.now();
        this.emprestimo = new Emprestimo(hoje,hoje.plusDays(7));
    }

    @Override
    public void digitarDados(){
        Consulta consulta = new Consulta();
        Livro livro = consulta.procurarLivro();// Coletar livro
        Usuario usuario = consulta.procurarUsuario();// Coletar usuário
        Bibliotecario bibliotecario = /*Coleta do banco de dados o único bibliotecario*/null;
        if(livro != null && usuario != null){
            emprestimo.setLivro(livro);
            emprestimo.setUsuario(usuario);
            emprestimo.setBibliotecario(bibliotecario);
        }
        else{
            System.out.println("Livro ou usuário não existente.");
        }
        
        
    }

}
