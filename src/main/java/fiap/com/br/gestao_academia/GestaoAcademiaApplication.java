package fiap.com.br.gestao_academia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class GestaoAcademiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestaoAcademiaApplication.class, args);
	}
}
