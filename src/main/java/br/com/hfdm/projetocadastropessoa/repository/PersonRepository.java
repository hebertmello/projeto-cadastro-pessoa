package br.com.hfdm.projetocadastropessoa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.hfdm.projetocadastropessoa.entity.Person;

/**
 * Repositório Spring Data da Entidade Pessoa.
 *
 * @author Hebert Falcão (<a href="mailto:hebert.mello@gmail.com</a>)
 * @since 9 de out de 2018
 */
public interface PersonRepository extends JpaRepository<Person, Long> {

	/**
	 * Método Responsável por Recuperar uma Pessoa pelo Nome.
	 * 
	 * @param nome
	 * @return
	 */
	Person findByNome(final String nome);

}
