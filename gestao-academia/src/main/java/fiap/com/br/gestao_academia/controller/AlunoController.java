package fiap.com.br.gestao_academia.controller;


import fiap.com.br.gestao_academia.model.Aluno;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AlunoController {

    private List<Aluno> alunos = new ArrayList<Aluno>();

    @GetMapping("/alunos")
    public List<Aluno> getalunos() {
        return alunos;
    }

    @PostMapping("/alunos")
    public ResponseEntity<Aluno> addCliente(@RequestBody Aluno aluno) {
        alunos.add(aluno);
        return ResponseEntity.status(201).body(aluno);
    }

    @GetMapping("/alunos/{id}")
    public ResponseEntity<Aluno> getCliente(@PathVariable Long id) {
        System.out.println("cliente id: " + id);
        var aluno = alunos.stream().filter(c -> id.equals(c.getId())).findFirst();
        if (aluno.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(aluno.get());
    }

}





