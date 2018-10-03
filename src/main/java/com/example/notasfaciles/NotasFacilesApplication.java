package com.example.notasfaciles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class NotasFacilesApplication {

	public static void main(final String[] args) {
		SpringApplication.run(NotasFacilesApplication.class, args);
	}
}
