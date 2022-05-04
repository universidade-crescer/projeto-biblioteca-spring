package com.letscode.projetobiblioteca.service;

import com.letscode.projetobiblioteca.model.Student;
import com.letscode.projetobiblioteca.repository.StudentRepository;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CookieValue;

import javax.crypto.SecretKey;
import javax.ws.rs.container.ContainerRequestContext;
import java.nio.charset.StandardCharsets;
import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;
    private final SecretKey CHAVE = Keys.hmacShaKeyFor(
            "7f-j&CKk=coNzZc0y7_4obMP?#TfcYq%fcD0mDpenW2nc!lfGoZ|d?f&RNbDHUX6"
                    .getBytes(StandardCharsets.UTF_8));

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public ResponseEntity saveStudent(Student student, @CookieValue("jwt") String jwt){
        if(jwt == null) {
            return ResponseEntity.status(401).body("Unauthenticated");
        }

        
        Jwts.parserBuilder()
                .setSigningKey(CHAVE)
                .build()
                .parseClaimsJws(jwt).getBody();

        Student saveStudent = studentRepository.save(student);
        ResponseEntity response = new ResponseEntity(saveStudent, HttpStatus.CREATED);
        return response;
    }

    public List<Student> getAllStudent() {
        return this.studentRepository.findAll();
    }
}
