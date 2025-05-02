package pe.edu.upeu.sysgestrepuesto.configuration;

import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;


@Configuration
public class CustomOpenAPIConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().info(new Info()
                .title("OPEN API SISTEMA DE Ventas")
                .version("0.0.1")
                .description("Servicios web de ventas")
                .termsOfService("http://swagger.io/terms/")
                .license(new License().name("Apache 2.0")
                        .url("http://springdoc.org"))
        );
    }
    // Configuración de grupos para documentación (endpoints específicos)
    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("springshop-public")  // Nombre del grupo
                .pathsToMatch("/api/**")      // Ruta de los endpoints a documentar
                .build();
    }
}
