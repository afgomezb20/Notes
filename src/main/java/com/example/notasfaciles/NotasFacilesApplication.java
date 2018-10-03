/**
 * This is a test app
 *
 * @autor Andrés Felipe Gómez Barbosa
 */
package com.example.notasfaciles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * Main class NotasFaciles app.
 */
@SpringBootApplication
@EnableJpaAuditing
public class NotasFacilesApplication {

	/**
	 * Main Metod app NotasFaciles.
	 *
	 * @param args parameter final
	 */
	public static void main(final String[] args) {
		SpringApplication.run(NotasFacilesApplication.class, args);
	}
}
