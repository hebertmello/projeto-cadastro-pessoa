package br.com.hfdm.projetocadastropessoa.web.rest;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.hfdm.projetocadastropessoa.entity.Person;
import br.com.hfdm.projetocadastropessoa.service.PersonService;

/**
 * Recurso da Entidade Pessoa.
 *
 * @author Hebert Falcão (<a href="mailto:hebert.mello@gmail.com</a>)
 * @since 9 de out de 2018
 */
@RestController
@RequestMapping("/rest")
public class PersonResource {

	@Autowired
	private PersonService personService;

	/**
	 * Método Responsável por Recuperar Todas as Pessoas.
	 *
	 * @param pageable
	 * @return
	 */
	@GetMapping("/pessoas")
	public ResponseEntity<List<Person>> findAll() {
		final List<Person> persons = personService.findAll();
		return new ResponseEntity<>(persons, HttpStatus.OK);
	}

	/**
	 * Método Responsável por Recuperar uma Pessoa.
	 *
	 * @param id
	 * @return
	 */
	@GetMapping("/pessoa/{id}")
	public ResponseEntity<Person> findOne(@PathVariable final Long id) {
		final Optional<Person> person = personService.findById(id);
		return new ResponseEntity<Person>(person.get(), HttpStatus.OK);
	}

	/**
	 * Método Responsável por Salvar (Incluir/Atualizar) uma Pessoa.
	 *
	 * @param person
	 * @return
	 */
	@PostMapping("/pessoa/save")
	public ResponseEntity<Person> save(@RequestBody final Person person) {
		if(person.getId().equals(-1L)) {
			// Inclusão de uma Pessoa
			person.setId(null);
		}

		personService.save(person);
		return ResponseEntity.ok().build();
	}

	/**
	 * Método Responsável por Remover uma Pessoa.
	 *
	 * @param id
	 * @return
	 */
	@DeleteMapping("/pessoa/remove/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable final Long id) {
		personService.deleteById(id);
		return ResponseEntity.ok().build();
	}

}
