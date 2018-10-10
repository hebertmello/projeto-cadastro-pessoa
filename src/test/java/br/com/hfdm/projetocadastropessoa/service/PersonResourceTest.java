package br.com.hfdm.projetocadastropessoa.service;

import java.util.UUID;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import br.com.hfdm.projetocadastropessoa.Application;
import br.com.hfdm.projetocadastropessoa.entity.Person;

/**
 * Teste do Serviço da Entidade Pessoa.
 *
 * @author Hebert Falcão (<a href="mailto:hebert.mello@gmail.com</a>)
 * @since 10 de out de 2018
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class PersonResourceTest {

	@Autowired
	private PersonService personService;

	/**
	 * Método Responsável por Testar o: "Salvar", "Pesquisar pelo Nome" e "Remover uma Pessoa".
	 */
	@Test
	@Transactional
	public void saveAndFindByNameAndRemovePerson() {
		final String personName = UUID.randomUUID().toString();

		final Person initialPerson = new Person();
		initialPerson.setNome(personName);

		final Person savedPerson = personService.save(initialPerson);

		Person requestedPerson = personService.findByNome(personName);
		Assertions.assertThat(requestedPerson != null);

		personService.deleteById(savedPerson.getId());

		requestedPerson = personService.findByNome(personName);
		Assertions.assertThat(requestedPerson == null);
	}

}
