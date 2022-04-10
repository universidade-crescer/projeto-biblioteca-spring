package com.letscode.projetobiblioteca.interfaces;

import com.letscode.projetobiblioteca.usuarios.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String> {

    @Query("select u.suspensao from Usuario u where u.cpf=?1")
    Integer findSupensao(String cpf);


}
