package fiap.com.br.gestao_academia.config;

import fiap.com.br.gestao_academia.model.Aluno;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseSeeder {

    @Bean
    public void seedDatabase() {
        // Aqui você pode simular a inserção de alunos
        Aluno aluno1 = new Aluno("João Silva", "12345678901", "11999999999", 25, 1L);
        Aluno aluno2 = new Aluno("Maria Oliveira", "98765432100", "11988888888", 30, 2L);
        Aluno aluno3 = new Aluno("Carlos Souza", "11122334455", "11977777777", 28, 3L);

        // Simula o banco de dados com uma lista de alunos
        // Em um banco real, você usaria algo como: alunoRepository.save(aluno1);
    }
}
