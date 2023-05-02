package net.javaguides.springboot;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(
	title = "Spring Boot REST API DOCUMENTATION",
		description = "Spring Boot REST API DOCUMENTATION",
		version = "1.0.0",
		contact = @Contact(
				name = "Cristopher Vergara" ,
				email = "cristopher.vergara.colombo@outlook.com",
				url = "https://www.instagram.com/habitantelunar4/"
		),
		license = @License(
				name = "Apache 2.0" ,
				url = "https://www.instagram.com/habitantelunar4/"
		)),
		externalDocs = @ExternalDocumentation(
				description = "Spring boot user management doc",
				url = "https://www.instagram.com/habitantelunar4/"
		)
)
public class SpringbootRestfulWebservicesApplication {

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestfulWebservicesApplication.class, args);
	}

}
