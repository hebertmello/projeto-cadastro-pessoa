package br.com.hfdm.projetocadastropessoa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe de Entrada.
 *
 * @author Hebert Falcão (<a href="mailto:hebert.mello@gmail.com</a>)
 * @since 9 de out de 2018
 */
@SpringBootApplication
public class Application {

	private static final Logger LOG = LoggerFactory.getLogger(Application.class);

	public static void main(final String[] args) {
		Application.LOG.info("Inicializando a Aplicação.");
		SpringApplication.run(Application.class, args);
	}

}
