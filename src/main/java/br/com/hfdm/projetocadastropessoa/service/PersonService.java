package br.com.hfdm.projetocadastropessoa.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import br.com.hfdm.projetocadastropessoa.entity.Person;
import br.com.hfdm.projetocadastropessoa.repository.PersonRepository;

/**
 * Serviço da Entidade Pessoa.
 *
 * @author Hebert Falcão (<a href="mailto:hebert.mello@gmail.com</a>)
 * @since 9 de out de 2018
 */
@Service
@Transactional
public class PersonService {

	@Autowired
	private PersonRepository personRepository;

	/**
	 * Método Responsável por Recuperar Todas as Pessoas.
	 *
	 * @return
	 */
	@Transactional(readOnly = true)
	public List<Person> findAll() {
		return personRepository.findAll();
	}

	/**
	 * Método Responsável por Recuperar uma Pessoa pelo Identificador.
	 *
	 * @param id
	 * @return
	 */
	@Transactional(readOnly = true)
	public Optional<Person> findById(final Long id) {
		return personRepository.findById(id);
	}

	/**
	 * Método Responsável por Salvar uma Pessoa.
	 *
	 * @param person
	 * @return
	 */
	public Person save(final Person person) {
		return personRepository.save(person);
	}

	/**
	 * Método Responsável por Remover uma Pessoa.
	 *
	 * @param id
	 */
	public void deleteById(final Long id) {
		personRepository.deleteById(id);
	}

}
