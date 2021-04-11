package com.fakhri.transaction;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class SpringTransactionalApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTransactionalApplication.class, args);
	}

}
