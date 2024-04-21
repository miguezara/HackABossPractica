package com.example.Ejercicio9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;



@SpringBootApplication

public class Ejercicio9Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio9Application.class, args);
	}



	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI().info(new Info()
				.title("API probando documentación")
				.version("0.0.1")
				.description("Un ejemplo de cómo documentar una API"));
	}
}
