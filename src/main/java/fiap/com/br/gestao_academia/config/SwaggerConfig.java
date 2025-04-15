package fiap.com.br.gestao_academia.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springdoc.core.annotations.EnableOpenApi;
import org.springdoc.webmvc.ui.SwaggerConfig;

@Configuration
@EnableOpenApi
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Gestão Academia API")
                        .description("API para gestão de alunos na academia")
                        .version("v1"));
    }
}
