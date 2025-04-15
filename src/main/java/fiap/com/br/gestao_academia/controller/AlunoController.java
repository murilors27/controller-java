package fiap.com.br.gestao_academia.controller;

import fiap.com.br.gestao_academia.model.Aluno;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Api(value = "Aluno API", tags = "Operações relacionadas aos alunos")  // Descrição do Swagger
@RestController
public class AlunoController {

    private List<Aluno> alunos = new ArrayList<Aluno>();

    @ApiOperation(value = "Lista todos os alunos")  // Descrição no Swagger
    @GetMapping("/alunos")
    @Cacheable("alunos")  // Habilita cache para este método
    public List<Aluno> getAlunos() {
        return alunos;
    }

    @ApiOperation(value = "Adiciona um novo aluno")  // Descrição no Swagger
    @PostMapping("/alunos")
    public ResponseEntity<Aluno> addAluno(@RequestBody Aluno aluno) {
        alunos.add(aluno);
        return ResponseEntity.status(201).body(aluno);
    }

    @ApiOperation(value = "Busca um aluno por ID")  // Descrição no Swagger
    @GetMapping("/alunos/{id}")
    @Cacheable("aluno")  // Habilita cache para este método
    public ResponseEntity<Aluno> getAluno(@PathVariable Long id) {
        System.out.println("Aluno id: " + id);
        var aluno = alunos.stream().filter(a -> id.equals(a.getId())).findFirst();
        if (aluno.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(aluno.get());
    }
}
